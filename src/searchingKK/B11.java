package searchingKK;

public class B11 {

    static int splitArray(int arr[],int m){

        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){

            start=Math.max(start,arr[i]);
            end+=arr[i];
        }

        while(start<end){

            // try for mid as a potential ans
            int mid=start+(end-start)/2;

            // calculate how many pieces you can divide this in with maximum sum
            int sum=0;
            int pieces=1;

            for(int i=0;i<arr.length;i++){

                if(sum+arr[i]>mid){
                    // you cannot add this in this subArray,make new one
                    // say you add this num in new subArray,then sum==num

                    sum = arr[i];
                    pieces++;

                }else {

                    sum=sum+arr[i];
                }

            }

            if(pieces>m){

                start=mid+1;
            }

            else {

                end=mid;
            }






        }

        return start;   // start==end
    }

    public static void main(String[] args) {

        int arr[]={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(arr,m));



    }
}
