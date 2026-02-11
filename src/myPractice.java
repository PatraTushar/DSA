import java.util.*;

public class myPractice {

    static void setRowColZero(int[][] arr, int a, int b) {

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {

            if (arr[a][i] == 1) arr[a][i] = -1;

        }


        for (int i = 0; i < rows; i++) {

            if (arr[i][b] == 1) arr[i][b] = -1;
        }


    }


    static ArrayList<Integer> leader(int[] num) {

        int n = num.length;

        ArrayList<Integer> result = new ArrayList<>();

        int max = num[n - 1];

        result.add(num[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (num[i] > max) {

                result.add(num[i]);
                max = num[i];
            }


        }

        Collections.reverse(result);

        return result;


    }

    static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int longest = Integer.MIN_VALUE;

        for (int ele : arr) set.add(ele);

        for (int ele : arr) {

            int curr = ele;
            int count = 0;
            while (set.contains(curr)) {

                count++;
                curr--;


            }

            longest = Math.max(longest, count);


        }

        return longest;

    }


    static void setMatrixZeroes(int[][] arr) {

        // Brute


        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == 0) {

                    setRowColZero(arr, i, j);


                }
            }


        }


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == -1) arr[i][j] = 0;
            }
        }


    }


    static void setZeroes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (arr[i][j] == 0) {

                    arr[i][0] = -1;
                    arr[0][j] = -1;
                }
            }
        }


        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (arr[i][0] == -1 || arr[0][j] == -1) {

                    arr[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < rows; i++) {

            if (arr[i][0] == -1) arr[i][0] = 1;
        }

        for (int j = 0; j < cols; j++) {

            if (arr[0][j] == -1) arr[0][j] = 0;
        }


    }

    static ArrayList<Integer> majorityElement2(int[] arr) {

        int n = arr.length;
        int majority1 = 0;
        int count1 = 0;
        int majority2 = 0;
        int count2 = 0;


        for (int ele : arr) {

            if (count1 == 0) {

                count1++;
                majority1 = ele;
            } else if (count2 == 0 && ele != majority1) {

                count2++;
                majority2 = ele;
            } else if (ele == majority1) count1++;
            else if (ele == majority2) count2++;

            else {

                count1--;
                count2--;


            }


        }


        int majority = n / 3;
        count1 = 0;
        count2 = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int ele : arr) {

            if (ele == majority1) count1++;
            if (ele == majority2) count2++;
        }

        if (count1 > majority) result.add(majority1);
        if (count2 > majority) result.add(majority2);

        return result;

    }

    static List<List<Integer>> sum3(int[] arr) {

        int n = arr.length;

        List<List<Integer>> result = new ArrayList<>();

        int i = 0;


        while (i < n - 2) {

            int j = i + 1;
            int k = n - 1;


            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {

                    k--;
                } else {

                    List<Integer> triplets = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplets);

                    int eleJ = arr[j];
                    int eleK = arr[k];

                    while (j < k && eleJ == arr[j]) j++;
                    while (j < k && eleK == arr[k]) k--;


                }


            }

            int eleI = arr[i];
            while (i < n - 2 && eleI == arr[i]) i++;


        }

        return result;


    }

    static List<List<Integer>> sum4(int[] arr, int target) {

        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        while (i < n - 3) {

            int j = i + 1;

            while (j < n - 2) {

                int k = j + 1;
                int l = n - 1;


                while (k < l) {

                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum < target) k++;
                    else if (sum > target) l--;
                    else {

                        List<Integer> four = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        result.add(four);

                        int eleK = arr[k];
                        int eleL = arr[l];

                        while (k < l && eleK == arr[k]) k++;
                        while (k < l && eleL == arr[l]) l--;
                        ;

                    }
                }

                int eleJ = arr[j];
                while (j < n - 2 && eleJ == arr[j]) j++;
            }

            int eleI = arr[i];
            while (i < n - 3 && eleI == arr[i]) i++;
        }

        return result;


    }

    static void swap(int[] arr1, int[] arr2, int left, int right) {

        if (arr1[left] > arr2[right]) {

            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }


    static void merge(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int length = m + n;

        int gap = length / 2 + length % 2;


        while (gap > 0) {

            int left = 0;
            int right = gap;

            while (right < length) {

                if (left < m && right < m) {

                    swap(arr1, arr1, left, right);
                } else if (left < m && right >= m) {

                    swap(arr1, arr2, left, right - m);
                } else {

                    swap(arr2, arr2, left - m, right - m);
                }

                left++;
                right++;
            }

            if (gap == 1) break;

            gap = gap / 2 + gap % 2;
        }


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

    static int[] mergeI(int[] arr1, int m, int[] arr2, int n) {

        int length = m + n;
        int i = m - 1;
        int j = n - 1;
        int idx = length - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] >= arr2[j]) {

                arr1[idx--] = arr1[i--];


            } else {

                arr1[idx--] = arr2[j--];


            }
        }


        return arr1;

    }

    static int[] missingAndRepeating(int[] arr, int n) {


        int sumOfN = n * (n + 1) / 2;
        int sqrOfN = n * (n + 1) * (2 * n + 1) / 6;

        int sum = 0;
        int square = 0;

        for (int ele : arr) {

            sum += ele;
            square += ele * ele;
        }

        long val1 = sumOfN - sum;  // 4
        long val2 = sqrOfN - square;  // 24

        val2 /= val1;

        long x = (val1 + val2) / 2;
        long y = val2 - x;

        return new int[]{(int) x, (int) y};


    }

    static double findMedian(int[] arr1, int[] arr2) {


        int m = arr1.length;
        int n = arr2.length;

        if (m > n) return findMedian(arr2, arr1);

        int length = m + n;

        int partition = (length + 1) / 2;


        int low = 0;
        int high = m;


        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = partition - mid1;

            int l1 = mid1 > 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = mid1 < m ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n ? arr2[mid2] : Integer.MAX_VALUE;


            if (l1 <= r2 && l2 <= r1) {

                if (length % 2 == 0) return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

                else return Math.max(l1, l2);

            } else if (l2 > r1) low = mid1 + 1;

            else high = mid1 - 1;
        }

        return 0;


    }

    static int kthElement(int[] arr1, int[] arr2,int k) {

        int m = arr1.length;
        int n = arr2.length;

        if (m > n) return kthElement(arr2, arr1,k);

        int length = m + n;

        int partition = (length + 1) / 2;

        int low = Math.max(0,k-n);
        int high = Math.min(k,m);

        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = partition - mid1;

            int l1 = mid1 > 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = mid2 > 0 ? arr2[mid2] : Integer.MIN_VALUE;
            int r1 = mid1 < n ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) return Math.max(l1,l2);

            else if (l2 > r1) low = mid1 + 1;
            else high = mid1 - 1;


        }

        return 0;

    }


    public static void main(String[] args) {

        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = leader(arr);
        System.out.println(ans);

        int[] num = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int res = longestConsecutive(num);
        System.out.println(res);


        int[][] arr1 = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        setMatrixZeroes(arr1);
        System.out.println(Arrays.deepToString(arr1));

        int[][] arr2 = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        setZeroes(arr2);
        System.out.println(Arrays.deepToString(arr1));

        int[] arr4 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(majorityElement2(arr4));

        int[] arr5 = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        List<List<Integer>> ans1 = sum3(arr5);
        System.out.println(ans1);

        int[] arr6 = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> ans12 = sum4(arr6, 0);
        System.out.println(ans12);

        int[] arr14 = {1, 3, 5, 7};
        int[] arr24 = {0, 2, 6, 8, 9};
        merge(arr14, arr24);

        int[] arr1$ = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2$ = {2, 5, 6};
        int n = 3;
        int[] answer = mergeI(arr1$, m, arr2$, n);
        System.out.println(Arrays.toString(answer));

        int[] ar5 = {4, 3, 6, 2, 1, 1};
        int len = 6;
        int[] r = missingAndRepeating(ar5, len);
        System.out.println(Arrays.toString(r));

        int[] a = {1, 3, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};
        double re = findMedian(a, b);
        System.out.println(re);


    }


}

