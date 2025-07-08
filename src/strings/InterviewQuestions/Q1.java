package strings.InterviewQuestions;

public class Q1 {

    static int stringCompression(char[] chars) {

     int idx=0;
     int i=0;
     int count=0;
     char currChar=chars[i];

     while (i< chars.length){

         if(chars[i]==chars[idx]){

             count++;
             i++;
         }

         else {

             chars[idx++]=currChar;
             if(idx<chars.length)  chars[idx++]=(char) count;
             count=1;


         }


     }

     return idx;



    }

    public static void main(String[] args) {

        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(stringCompression(ch));


    }
}
