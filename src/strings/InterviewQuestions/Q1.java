package strings.InterviewQuestions;

public class Q1 {

    static int stringCompression(char[] chars) {

        int index = 0;
        int start = 0;
        int end=0;
        int count=0;

        while (end<chars.length){

            if(start==end){
                end++;
            }

            else {

                count=end-start;

                if (count>1){

                    chars[index++]=(char) start;
                    chars[index]=(char) count;
                    start=end;
                }


            }
        }

        count=end-start;

        if (count>1){

            chars[index++]=(char) start;
            chars[index]=(char) count;

        }

        return index;

    }

    public static void main(String[] args) {

        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(stringCompression(ch));


    }
}
