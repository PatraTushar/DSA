package Greedy;

public class Q39 {


    // BRUTE FORCE APPROACH
    static double maxAverageRatio(int[][] classes, int extraStudents) {

        //  Time Complexity: O( n * extraStudents)
        //  Space Complexity: O(n)


        int n = classes.length;

        double[] passRatio = new double[n];

        for (int i = 0; i < n; i++) {

            double ratio = (double) classes[i][0] / classes[i][1];
            passRatio[i] = ratio;


        }


        while (extraStudents != 0) {

            double[] updatedPassRatio = new double[n];
            double[] delta = new double[n];

            for (int i = 0; i < n; i++) {

                double ratio = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
                updatedPassRatio[i] = ratio;
                delta[i] = updatedPassRatio[i] - passRatio[i];


            }


            int idx = -1;
            double bestDelta = Integer.MIN_VALUE;
            for (int i = 0; i < delta.length; i++) {

                if (delta[i] > bestDelta) {


                    bestDelta = delta[i];
                    idx = i;

                }


            }


            passRatio[idx] = updatedPassRatio[idx];
            classes[idx][0] += 1;
            classes[idx][1] += 1;

            extraStudents--;

        }


        double maxAvgPassRatio = 0.0;

        for (int i = 0; i < n; i++) {

            maxAvgPassRatio += (double) classes[i][0] / classes[i][1];


        }

        return maxAvgPassRatio / n;


    }

    public static void main(String[] args) {

        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        System.out.println(maxAverageRatio(classes, extraStudents));


    }
}
