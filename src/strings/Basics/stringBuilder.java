package strings.Basics;

public class stringBuilder {

    public static void main(String[] args) {

        StringBuilder str=new StringBuilder();

        for(int i=0;i<26;i++){

            char ch=(char)('a' +i);
            str.append(ch);          // here no new objects are made it is changed in the original object that has made i.e new StringBuilder();
        }

        System.out.println(str);

    }
}
