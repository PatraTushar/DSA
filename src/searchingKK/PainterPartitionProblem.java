package searchingKK;

public class PainterPartitionProblem {

    static int PPP(int arr[],int n,int Painter){

        int start=0;
        int end=0;
        for(int i=0;i<n;i++){

            start=Math.max(start,arr[i]);
            end+=arr[i];
        }

        while (start<end){

            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;

            for(int i=0;i<n;i++){

                if(sum+arr[i]>mid){
                    sum=arr[i];
                    pieces++;
                }

                else {
                    sum+=arr[i];
                }
            }

            if(pieces>Painter){
                start=mid+1;
            }

            else {
                end=mid;
            }
        }

        return start;
    }


    public static void main(String[] args) {

        int arr[]={10,20,10,10};
        int n=4;
        int painters=2;
        System.out.println(PPP(arr,n,painters));
    }
}
