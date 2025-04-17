package HASHSET.interviewQuestions;
import java.util.HashSet;
public class Q1 {

    static int longestConsecutive(int[] arr){

        HashSet<Integer> st=new HashSet();
        int maxLength=0;

        for (int num:arr){
            st.add(num);

        }



        for(int num:st){

            if(!st.contains(num-1)){        // num is a starting point of a sequence

                int currNum=num;
               int currStreak=1;

               while (st.contains(currNum+1)){
                   currStreak++;
                   currNum++;
               }

               maxLength=Math.max(maxLength,currStreak);


            }
        }

        return maxLength;


    }

    public static void main(String[] args) {

        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
