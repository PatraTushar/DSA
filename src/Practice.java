
public class Practice {


    public static void isArmstrong(int a){

        int OriginalNumber,remainder,result=0;

        OriginalNumber=a;

        while(OriginalNumber!=0){

            remainder=OriginalNumber%10;
            result+=Math.pow(remainder,3);
            OriginalNumber=OriginalNumber/10;


        }


        if(result==a){
            System.out.println("armstrong number");
        }

        else{
            System.out.println(" not a armstrong number ");
        }
    }


    public static void main(String[] args) {

    int n=371;
    isArmstrong(n);









    }



}