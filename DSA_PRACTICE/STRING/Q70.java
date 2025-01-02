package DSA_PRACTICE.STRING;

public class Q70 {

    public static void main(String[] args) {

        String str="PHysiCs";

        for(int i=0;i<str.length();i++){

            boolean flag=true;          //Capital
            char ch=str.charAt(i);
            int ascii=(int)ch;

            if(ascii>=97){
                flag=false;
            }

            if(flag==true){
                ascii=ascii+32;
                char dh=(char) ascii;
                str=str.substring(0,i) + dh + str.substring(i+1);

            }

            else{

                ascii=ascii-32;
                char dh=(char) ascii;
                str=str.substring(0,i) + dh + str.substring(i+1);

            }

        }

        System.out.println(str);
    }
}
