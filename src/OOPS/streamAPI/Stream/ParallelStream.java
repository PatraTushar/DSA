package OOPS.streamAPI.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    private static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }


        public static void main(String[] args) {

        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance of large data sets
        // workload is distributed across multiple threads

            //using stream
            long startTime=System.currentTimeMillis();
        List<Integer> list= Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factorialList=list.stream().map(ParallelStream::factorial).toList();
        long endTime=System.currentTimeMillis();
            System.out.println(" Time taken with stream "+(endTime-startTime)+"ms");

            //using parallel stream
             startTime=System.currentTimeMillis();
             factorialList=list.parallelStream().map(ParallelStream::factorial).toList();
            // factorialList=list.parallelStream().map(ParallelStream::factorial).sequential().toList();
            endTime=System.currentTimeMillis();
            System.out.println(" Time taken with stream "+(endTime-startTime)+"ms");


            // parallel stream are most effective for CPU-intensive or large datasets where tasks are independent
            // They may add overhead for simple tasks or small datasets


            // cumulative sum
            //[1,2,3,4,5]->[1,3,6,10,15]

            List<Integer> numbers= Arrays.asList(1,2,3,4,5);
            AtomicInteger sum=new AtomicInteger(0);
            List<Integer> cumulativeSum=numbers.parallelStream().map(sum::addAndGet).toList();
            System.out.println(" Expected cumulative sum:[1,3,6,10,15");
            System.out.println("Actual result with parallel stream"+cumulativeSum);













        }
}
