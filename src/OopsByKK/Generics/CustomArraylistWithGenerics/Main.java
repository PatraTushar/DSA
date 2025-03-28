package OopsByKK.Generics.CustomArraylistWithGenerics;

class CustomArrayList<T> {
    private T[] arr;       // Internal array for storing elements
    private int size;      // Number of elements currently stored
    private int capacity;  // Maximum number of elements before resizing
    private static final int DEFAULT_CAPACITY = 10;  // Default initial size

    // Constructor with default capacity

    @SuppressWarnings("unchecked")
    public CustomArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.arr = (T[]) new Object[capacity]; // Creating a generic array
        this.size = 0;
    }

    // Constructor with custom capacity

    @SuppressWarnings("unchecked")
    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Add an element to the list
    public void add(T value) {
        if (size == capacity) {
            resize(); // Resize array if full
        }
        arr[size++] = value;  // Add element and increase size
    }

    // Resize the array when it's full

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;  // Double the capacity
        T[] newArr = (T[]) new Object[capacity]; // Create a larger array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];  // Copy old elements into the new array
        }
        arr = newArr; // Point to the new array
    }

    // Get an element from the list at a given index
    public  T get(int index) {
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
    @SuppressWarnings("unchecked")
    private void shrink() {
        capacity /= 2;
        T[] newArr = (T[]) new Object[capacity];
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

    @SuppressWarnings("unchecked")
    public void clear() {
        size = 0;
        capacity = DEFAULT_CAPACITY;
        arr = (T[]) new Object[capacity];  // Reset array
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
        // Integer List
        CustomArrayList<Integer> intList = new CustomArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println("Integer List:");
        intList.print();  // Output: 10 20 30 40

        // Get an element at index 2
        int elementAtIndex2 = intList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2); // Output: 30

        // Remove element at index 1
        intList.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println("Integer List after removal:");
        intList.print();  // Output: 10 30 40

        // Size of the list
        System.out.println("Current size of Integer list: " + intList.size()); // Output: 3

        // Clear the Integer list
        intList.clear();
        System.out.println("Integer List after clearing:");
        intList.print();  // Output: (empty list)

        // String List
        CustomArrayList<String> stringList = new CustomArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("String List:");
        stringList.print();  // Output: Apple Banana Cherry

        // Get an element at index 1
        String elementAtIndex1 = stringList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1); // Output: Banana

        // Remove element at index 0
        stringList.remove(0); // Removes the element at index 0 (which is "Apple")
        System.out.println("String List after removal:");
        stringList.print();  // Output: Banana Cherry

        // Size of the list
        System.out.println("Current size of String list: " + stringList.size()); // Output: 2

        // Clear the String list
        stringList.clear();
        System.out.println("String List after clearing:");
        stringList.print();  // Output: (empty list)
    }
}



