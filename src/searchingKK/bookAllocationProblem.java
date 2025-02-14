package searchingKK;

public class bookAllocationProblem {

    static int BAP(int Book[],int Student){

        int start=0;
        int end=0;


        for(int i=0;i<Book.length;i++){

            start=Math.max(start,Book[i]);
            end+=Book[i];
        }

        while (start<end){

            int mid=start+(end-start)/2;

            int sum=0;
            int split=1;

            for (int i=0;i<Book.length;i++){


                if(sum+Book[i]>mid){
                    sum=Book[i];
                    split++;
                }

                else {
                    sum=sum+Book[i];
                }

            }

            if(split>Student){

                start=mid+1;

            }

            else {
                end=mid;
            }
        }

        return start;




    }

    public static void main(String[] args) {

        int BookOfPages[]={12,34,67,90};
        int Students=2;
        System.out.println(BAP(BookOfPages,Students));
    }
}
