package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q26 {

    public static boolean isHappy(int n){

        int slow=n;
        int fast=n;


        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));

        }while (slow!=fast);

        if (slow==1){
            return true;
        }

        return false;
    }

    static int findSquare(int number){
        int ans=0;

        while (number>0){
            int rem=number%10;
            ans+=rem * rem;
            number/=10;
        }

        return ans;
    }

    public static void main(String[] args) {

        // Q: Happy number (leeTCode->202)

        int n=61;

        System.out.println(isHappy(2));

    }
}
