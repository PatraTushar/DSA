package ArraysbyStriver.Basics;

public class MaxValueInTheArray {

    static int max(int num[]){

        int max=num[0];

        for(int i=0;i<num.length;i++){

            if(num[i]>max){
                max=num[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {

        int arr[]={10,20,100,400,3,22,2};
        int ans=max(arr);
        System.out.println(ans);



    }
}
