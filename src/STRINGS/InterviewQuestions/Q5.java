package STRINGS.InterviewQuestions;

public class Q5 {

    static boolean arrayStringsAreEqual(String[] word1, String[] word2){

        // BruteForce Approach

        //Time Complexity: O(N + M)
        //Space Complexity: O(N + M)

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }

        for(int i=0;i< word2.length;i++){
            sb2.append(word2[i]);
        }

        return sb1.toString().equals(sb2.toString());


    }


    static boolean arrayStringsAreEqualI(String[] word1, String[] word2){

        // Optimal

        //Time Complexity: O(N + M)
        //Space Complexity: O(1)

        int i=0;
        int j=0;
        int p1=0;
        int p2=0;

        while (i<word1.length && j<word2.length){


            if(word1[i].charAt(p1)!=word2[j].charAt(p2)) return false;

            p1++;
            p2++;

            if(p1==word1[i].length()){
                i++;
                p1=0;
            }

            if(p2==word2[j].length()){
                j++;
                p2=0;
            }


        }

        return (i==word1.length && j==word2.length);
    }

    public static void main(String[] args) {

        // leeTCode->1662

        String[] word1= {"ab", "c"};
        String[] word2= {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        System.out.println(arrayStringsAreEqualI(word1,word2));
    }
}
