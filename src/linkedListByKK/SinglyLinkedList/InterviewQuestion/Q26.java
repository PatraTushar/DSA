package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q26 {

    public static boolean isHappy(int n){

        //Time Complexity: O(log n) per number × number of unique numbers in the cycle (at most 243) ⇒ O(log n)
        //Space Complexity: O(1)


        int slow=n;
        int fast=findSquare(n);

        while (slow!=fast){

            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));


        }

        return slow==1;
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

        int n=19;

        System.out.println(isHappy(n));

    }
}
