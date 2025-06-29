package ArraysbyStriver.binarySearchPattern;

public class Q14 {

    static int findMax(int[] books){

        int max=Integer.MIN_VALUE;

        for(int pages:books){

            max=Math.max(max,pages);

        }

        return max;
    }

    static int totalSum(int[] books){

        int sum=0;
        for(int pages:books){
            sum+=pages;
        }

        return sum;
    }

    static int studentPossibleForTheMid(int[] books,int mid){

        int countStudent=1;
        int pages=0;

        for(int i=0;i<books.length;i++){

            if(pages+books[i]<=mid){
                pages+=books[i];
            }
            else {
                countStudent++;
                pages=books[i];
            }
        }

        return countStudent;


    }

    static int bookAllocation(int[] books,int students){

        int start=findMax(books);
        int end=totalSum(books);
        int ans=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            int possibleStudent=studentPossibleForTheMid(books,mid);

            if(possibleStudent>students){
                start=mid+1;

            }

            else {

                end=mid-1;

            }



        }

        return start;


    }



    public static void main(String[] args) {

        int[] books={25,46,28,49,24};
        int students=4;
        System.out.println(bookAllocation(books,students));



    }



}


