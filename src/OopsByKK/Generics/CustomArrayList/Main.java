package OopsByKK.Generics.CustomArrayList;

class Array {

    public static class CustomArrayList {


        private int[] arr;
        private int size;
        private int capacity;

        private static final int DEFAULT_CAPACITY = 10;

        CustomArrayList() {

            this.capacity = DEFAULT_CAPACITY;
            this.arr = new int[capacity];
            this.size = 0;
        }

        CustomArrayList(int[] arr, int size, int capacity) {

            this.arr = arr;
            this.size = size;
            this.capacity = capacity;
        }


        private void resize() {

            capacity *= 2;
            int[] dynamicArr = new int[capacity];

            for (int i = 0; i < size; i++) {

                dynamicArr[i] = arr[i];
            }

            arr = dynamicArr;


        }

        public void add(int val) {

            if (size == capacity) {
                resize();
            }

            arr[size++] = val;


        }


        public void remove(int index) {

            if (index < 0 || index >= size) {

                throw new IndexOutOfBoundsException(" Index out of bound ");
            }

            for (int i = index; i < size - 1; i++) {

                arr[i] = arr[i + 1];

            }

            size--;

            if (size < capacity / 4 && capacity > DEFAULT_CAPACITY) {
                shrink();
            }


        }

        private void shrink(){

            capacity/=2;
            int[] dynamicArr=new int[capacity];

            for(int i=0;i<size;i++){
                dynamicArr[i]=arr[i];
            }

            arr=dynamicArr;


        }



        public int get(int index) {

            if (index < 0 || index >= size) {

                throw new IndexOutOfBoundsException(" Index out of bound ");
            }

            return arr[index];


        }

        public int size(){


            return size;
        }


        public void clear(){

            size=0;
            capacity=DEFAULT_CAPACITY;
            arr=new int[capacity];
        }

        public void display(){

            for(int i=0;i<size;i++){

                System.out.print(arr[i] +" ");
            }

            System.out.println();
        }


    }

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
        list.display();  // Output: 10 20 30 40

        // Step 4: Get and print an element at a specific index
        int elementAtIndex2 = list.get(2);  // Should return 30
        System.out.println("Element at index 2: " + elementAtIndex2); // Output: 30

        // Step 5: Remove an element at a specific index
        list.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println("List after removing element at index 1:");
        list.display();  // Output: 10 30 40

        // Step 6: Check the size of the list
        System.out.println("Current size of the list: " + list.size()); // Output: 3

        // Step 7: Clear the list
        list.clear();
        System.out.println("List after clearing:");
        list.display();  // Output: (empty list)
    }




}



