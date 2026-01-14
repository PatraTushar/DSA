package Recursion.CodeWithMik;

public class Q32 {

    int ans = 0;

    void solve(int[][] requests, int index, int[] balance, int count) {

        if (index == requests.length) {

            for (int ele : balance) {

                if (ele != 0) return;
            }

            ans = Math.max(ans, count);
            return;
        }


        int from = requests[index][0];
        int to = requests[index][1];

        balance[from]--;
        balance[to]++;

        solve(requests, index + 1, balance, count + 1);

        balance[from]++;
        balance[to]--;

        solve(requests, index + 1, balance, count);


    }

    int maximumRequests(int n, int[][] requests) {

        //  Time Complexity (TC): O(2^R * n)
        //  Space Complexity (SC): O(R + N)


        int[] balance = new int[n];
        solve(requests, 0, balance, 0);
        return ans;


    }


    public static void main(String[] args) {

        Q32 obj=new Q32();

        int[][] requests={{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
        int n=5;
        System.out.println(obj.maximumRequests(n,requests));

    }
}
