


public class myPractice {


    static double findMedian(int[] arr1,int[] arr2){

        int m=arr1.length;          // arr2.length
        int n=arr2.length;          // arr1.length
        int totalLength=m+n;
        int left=(m+n+1)/2;

        if(m>n) return findMedian(arr2,arr1);
        int low=0;
        int high=m;

        while (low<=high){

            int mid1=low+(high-low)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1>0) l1=arr1[mid1-1];
            if(mid2>0) l2=arr2[mid2-1];
            if(mid1<m) r1=arr1[mid1];
            if(mid2<n) r2=arr2[mid2];


            if(l1<=r2 && l2<=r1){

                if(totalLength%2!=0){

                    return Math.max(l1,l2);



                }

                else {

                    return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }

            }

            else if(l1>r2){
                high=mid1-1;
            }

            else {
                low=mid1+1;
            }







        }

        return 0;
    }

    static int findKthElement(int[] a,int[] b,int k){

        int m=a.length;
        int n=b.length;
        int left=k;

        if(m>n) return findKthElement(b,a,k);

        int low=Math.max(0,k-n);
        int high=Math.min(k,m);

        while (low<=high){

            int mid1=low+(high-low)/2;
            int mid2=left-mid1;

            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1<m) r1=a[mid1];
            if(mid2<n) r2=b[mid2];
            if(mid1>0) l1=a[mid1-1];
            if(mid2>0) l2=b[mid2-1];

            if(l1<=r2 && l2<=r1 ){

                return Math.min(r1,r2);


            }

            else if(l1>r2){

                high=mid1-1;



            }

            else {  // l2>r1

                low=mid1+1;

            }

        }

        return 0;


    }

    static int maximum1s(int[][] mat){ // brute force approach

        int max=-1;
        int rows=mat.length;
        int cols=mat[0].length;
        int index=-1;

        for(int i=0;i<rows;i++){

            int countRow=0;

            for (int j=0;j<cols;j++){
                countRow+=mat[i][j];

            }
            if(countRow>max){
                max=countRow;
                index=i;

            }

        }

        return index ;
    }

    static int findMaxInWhichRow(int[][] arr,int rows,int cols){

        int max=Integer.MIN_VALUE;
        int row=-1;

        for(int i=0;i<rows;i++){

            if(arr[i][cols]>max){
                max=arr[i][cols];
                row=i;

            }
        }

        return row;


    }
    static int[] peakElementII(int[][] mat){

        int rows=mat.length;
        int cols=mat[0].length;
        int low=0;
        int high=cols-1;


        while (low<=high){

            int mid=low+(high-low)/2;

            int rowHasMax=findMaxInWhichRow(mat,rows,mid);

            if((mid==0 || mat[rowHasMax][mid]>mat[rowHasMax][mid-1]) && (mid==cols-1 || mat[rowHasMax][mid]>mat[rowHasMax][mid+1])){

                return new int[]{rowHasMax,cols};

            }

            else if( mid>0 && mat[rowHasMax][mid-1]>mat[rowHasMax][mid]){
                high=mid-1;
            }

            else {
                low=mid+1;
            }





        }

        return new int[]{-1,-1};
    }



    public static void main(String[] args) {

        int[] arr1={1,3,4,7,10,12};
        int[] arr2={2,3,6,15};
        double ans=findMedian(arr1,arr2);
        System.out.println(ans);





    }





    }





