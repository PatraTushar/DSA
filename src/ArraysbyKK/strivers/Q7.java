package ArraysbyKK.strivers;



import java.util.HashMap;

public class Q7 {

    static int  numberAppearOnce(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++){

            if(!map.containsKey(arr[i])){

                map.put(arr[i],1);

            }

            else {

                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }

        return -1;



    }

    static int numberAppearOnceI(int[] arr){

        //Time Complexity (TC): O(n + m)
        //Space Complexity (SC): O(m)

        int max=0;

        for (int a:arr){
            max=Math.max(a,max);
        }

        int[] freq=new int[max+1];

        for(int i=0;i<arr.length;i++){

            freq[arr[i]]++;
        }

        for (int i=0;i<freq.length;i++){
            if(freq[i]==1) return i;
        }

        return -1;


    }

    static int numberAppearOnceIII(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int result=0;
        for (int ele:arr){
            result^=ele;
        }

        return result;
    }

    public static void main(String[] args) {

        // find the number that appear once and then other twice

        int[] arr={1,1,2,3,3,4,4};
        System.out.println(numberAppearOnce(arr));
        System.out.println(numberAppearOnceI(arr));
        System.out.println(numberAppearOnceIII(arr));
    }
}
