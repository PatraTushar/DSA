package StackByStriver.interviewQuestions;


import java.util.Stack;

class twoStack {


    int[] arr;
    int top1;
    int top2;
    int n;


    public twoStack() {

        n = 100;
        arr = new int[n];
        top1 = -1;
        top2 = n;


    }


    void push1(int x) {

        if (top1 + 1 == top2) {


            return;
        }

        arr[++top1] = x;


    }

    void push2(int x) {

        if (top2 - 1 == top1) {

            return;


        }

        arr[--top2] = x;


    }

    int pop1() {

        if (top1 == -1) return -1;

        int ele = arr[top1];
        top1--;

        return ele;


    }

    int pop2() {

        if (top2 == n) return -1;

        int ele = arr[top2];
        top2++;

        return ele;


    }
}

public class Q29 {

    public static void main(String[] args) {

        twoStack obj = new twoStack();
        obj.push1(2);
        obj.push1(3);
        obj.push2(4);

        System.out.println(obj.pop1());
        System.out.println(obj.pop2());
        System.out.println(obj.pop2());


    }
}
