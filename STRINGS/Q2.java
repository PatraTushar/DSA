package STRINGS;

public class Q2 {

    public static void main(String[] args) {
        //toggle

        String str="PhYSiCS";
        System.out.println(str);

        for(int i=0;i<str.length();i++){

            boolean flag=true;         //capital
            char ch=str.charAt(i);
            int ascii=(int)ch;

            if(ascii>=97){
                flag=false;
            }

            if(flag==true){
                ascii=ascii+32;
                char dh=(char)ascii;              //PHYsics
               str= str.substring(0,i) + dh + str.substring(i+1);
            }

            else{
                ascii=ascii-32;
                char dh=(char)ascii;              //PHYsics
                str= str.substring(0,i) + dh + str.substring(i+1);


            }


        }

        System.out.println(str);
    }
}
