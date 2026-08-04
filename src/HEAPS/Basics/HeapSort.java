package HEAPS.Basics;

public class HeapSort {

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int index) {       // heapifyDown-> Top to Bottom


        while (true) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < n && arr[left] > arr[largest]) largest = left;

            if (right < n && arr[right] > arr[largest]) largest = right;

            if (largest == index) break;

            swap(arr, index, largest);
            index = largest;
        }


    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {22,13,17,11,10,14,12};

        System.out.println("Before Sorting:");
        printArray(arr);

        heapSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);


    }
}
