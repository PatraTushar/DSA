package StackByStriver.interviewQuestions;


import java.util.LinkedList;
import java.util.Stack;

class NStack {


    int[] arr;  // stores all elements.
    int[] top;  // stores the index of the top element for each stack.
    int[] next;  // manages free spaces and links elements within the same stack.
    int freeSpot; // points to the next available free index in arr.


    public NStack(int N, int S) {      // S=size of the array   N=Number Of stacks


        arr = new int[S];
        top = new int[N];
        next = new int[S];

        for (int i = 0; i < N; i++) {

            top[i] = -1;
        }

        for (int i = 0; i < S - 1; i++) {

            next[i] = i + 1;

        }

        next[S - 1] = -1;

        freeSpot = 0;


    }

    public boolean push(int x, int m) {

        if (freeSpot == -1) return false;

        // find index
        int index = freeSpot;

        // update freeSpot
        freeSpot = next[index];

        // insert element into array
        arr[index] = x;

        //update next
        next[index] = top[m - 1];

        // update top
        top[m - 1] = index;


        return true;

    }

    public int pop(int m) {

        if (top[m - 1] == -1) return -1;

        int index = top[m - 1];
        top[m - 1] = next[index];

        next[index] = freeSpot;

        freeSpot = index;

        return arr[index];


    }


}

public class Q30 {


    public static void main(String[] args) {

        NStack stacks = new NStack(3, 10);

        System.out.println(stacks.pop(2)); // -1
        System.out.println(stacks.push(10, 1));  // true
        System.out.println(stacks.push(20, 1));  // true
        System.out.println(stacks.push(30, 2));   // true
        System.out.println(stacks.pop(1)); // 20
        System.out.println(stacks.pop(2)); // 30


    }
}
