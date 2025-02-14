package searchingKK;

public class Q7 {



    static int maxWealth(int arr[][]){

        // person=rows      accounts=columns

        int max=Integer.MIN_VALUE;


        for(int person=0;person<arr.length;person++){

            // when you start a new column , take a new sum for that row
            int sum=0;


            for(int accounts=0;accounts<arr[person].length;accounts++){

                sum=sum + arr[person][accounts];


            }

            // now we have sum of accounts of that person
            //check with overall answer

            if(sum>max){
                max=sum;
            }



        }

        return max;

        
    }

    public static void main(String[] args) {

        int num[][]={{1,2,3},
                    {3,2,1}};

        System.out.println(maxWealth(num));

    }
}
