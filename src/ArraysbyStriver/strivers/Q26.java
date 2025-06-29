package ArraysbyStriver.strivers;

public class Q26 {

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {    //brute force approach

        //Time Complexity: O(m + n)
       // Space Complexity: O(m + n)

        int m=nums1.length;
        int n=nums2.length;
        int[] result=new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){

            if(nums1[i]<=nums2[j]){
                result[k]=nums1[i];
                i++;

            }

            else{

                result[k]=nums2[j];
                j++;

            }
            k++;
        }

        while(i<m){
            result[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n){

            result[k]=nums2[j];
            j++;
            k++;
        }

        int a=result.length;

        if(a%2==0){

            long mid1=result[a/2];
            long mid2=(result[a/2-1]);

            return (mid1+mid2)/2.0;
        }

        return result[a/2];

    }

    static double findMedianOf2SortedArrays(int[] nums1,int[] nums2){  // optimal approach

       // Time Complexity: O(log min(n1,n2))
       // Space Complexity: O(1)

        int n1=nums1.length;
        int n2=nums2.length;
        int partitions=(n1+n2+1)/2;
        int n=n1+n2;

        if (n1>n2) return findMedianOf2SortedArrays(nums2,nums1);

        int low=0;
        int high=n1;

        while (low<=high){

            int mid1=low+(high-low)/2;
            int mid2=partitions-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1>0) l1=nums1[mid1-1];
            if(mid2>0) l2=nums2[mid2-1];

            if(l1<=r2 && l2<=r1){

                if(n%2!=0){
                    return Math.max(l1,l2);
                }

                else {

                    return (double) ( Math.max(l1,l2)+  Math.min(r1,r2))/2.0;

                }

            }

            else if(l1>r2) high=mid1-1;

            else low=mid1+1;




        }

        return 0;




    }

    public static void main(String[] args) {

        // median of 2 sorted arrays

        int[] arr1={1,3,4,7,10,12};
        int[] arr2={2,3,6,15};



        double ans=findMedianSortedArrays(arr1,arr2);
        System.out.println(ans);
        double result=findMedianOf2SortedArrays(arr1,arr2);
        System.out.println(result);

    }
}
