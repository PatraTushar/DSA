package OopsByKK.Generics.CustomArrayList;

class CustomArrayList {
    private int[] arr;       // Internal array for storing elements
    private int size;        // Number of elements currently stored
    private int capacity;    // Maximum number of elements before resizing
    private static final int DEFAULT_CAPACITY = 10;  // Default initial size

    // Constructor with default capacity
    public CustomArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Constructor with custom capacity
    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Add an element to the list
    public void add(int value) {
        if (size == capacity) {
            resize(); // Resize array if full
        }
        arr[size++] = value;  // Add element and increase size
    }

    // Resize the array when it's full
    private void resize() {
        capacity *= 2;  // Double the capacity
        int[] newArr = new int[capacity]; // Create larger array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];  // Copy old elements into the new array
        }
        arr = newArr; // Point to the new array
    }

    // Get an element from the list at a given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    // Remove an element from the list at a given index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Shift elements left to fill the gap
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;  // Decrease size after removal

        // Shrink array if only 25% of space is used
        if (size < capacity / 4 && capacity > DEFAULT_CAPACITY) {
            shrink();
        }
    }

    // Shrink the array when too much unused space is available
    private void shrink() {
        capacity /= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];  // Copy elements into the new array
        }
        arr = newArr;  // Point to the new array
    }

    // Get the current size of the list
    public int size() {
        return size;
    }

    // Clear all elements from the list
    public void clear() {
        size = 0;
        capacity = DEFAULT_CAPACITY;
        arr = new int[capacity];  // Reset array
    }

    // Print the contents of the list
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // New line after printing all elements
    }
}


public class Main {
    public static void main(String[] args) {
        // Step 1: Create an instance of CustomArrayList
        CustomArrayList list = new CustomArrayList();

        // Step 2: Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Step 3: Print the elements using the print method
        System.out.println("List contents:");
        list.print();  // Output: 10 20 30 40

        // Step 4: Get and print an element at a specific index
        int elementAtIndex2 = list.get(2);  // Should return 30
        System.out.println("Element at index 2: " + elementAtIndex2); // Output: 30

        // Step 5: Remove an element at a specific index
        list.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println("List after removing element at index 1:");
        list.print();  // Output: 10 30 40

        // Step 6: Check the size of the list
        System.out.println("Current size of the list: " + list.size()); // Output: 3

        // Step 7: Clear the list
        list.clear();
        System.out.println("List after clearing:");
        list.print();  // Output: (empty list)
    }
}



