package HEAPS.Basics;

import java.util.ArrayList;

public class MaxHeapImplementation {

    private ArrayList<Integer> heap;

    public MaxHeapImplementation() {

        heap = new ArrayList<>();
    }


    // Insert An Element
    public void insert(int value) {

        heap.add(value);
        heapifyUp(heap.size() - 1);


    }


    private void heapifyUp(int index) {

        while (index > 0) {

            int parent = (index - 1) / 2;

            if (heap.get(parent) >= heap.get(index)) break;

            swap(parent, index);
            index = parent;
        }


    }


    void swap(int i, int j) {

        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);


    }


    public int peek() {

        if (heap.isEmpty()) throw new RuntimeException(" Heap Is Empty ");

        return heap.get(0);
    }


    // Remove And Return The Maximum Element

    private int remove() {

        if (heap.isEmpty()) throw new RuntimeException(" Heap Is Empty ");

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {

            heap.set(0, last);
            heapifyDown(0);
        }

        return max;


    }


    private void heapifyDown(int index) {

        int size = heap.size();

        while (true) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap.get(left) > heap.get(largest)) largest = left;

            if (right < size && heap.get(right) > heap.get(largest)) largest = right;

            if (largest == index) break;

            swap(index, largest);
            index = largest;
        }


    }

    public void printHeap() {

        System.out.println(heap);
    }


    public static void main(String[] args) {

        MaxHeapImplementation heap = new MaxHeapImplementation();

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(15);

        heap.printHeap();      // [30, 20, 5, 10, 15]

        System.out.println(heap.peek());    // 30

        System.out.println(heap.remove());  // 30

        heap.printHeap();      // [20, 15, 5, 10]


    }
}
