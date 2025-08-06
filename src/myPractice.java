import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myPractice {


    static String convertToString(int n) {




        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            sb.append(i);
        }

        return sb.toString();
    }

    static List<String> permutations(String str, String Ans, List<String> list) {

        if (str.isEmpty()) {
            list.add(Ans);
            return list;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= Ans.length(); i++) {

            String first = Ans.substring(0, i);
            String second = Ans.substring(i);
            permutations(str.substring(1), first + ch + second, list);

        }

        return list;


    }

    static String kthPermutation(int n, int k) {

        // Time Complexity: O(n! × n + n! log n!)
        //Space Complexity: O(n!)

        String ans = convertToString(n);

        List<String> list = permutations(ans, "", new ArrayList<>());

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            if (i == k - 1) {

                return list.get(i);


            }


        }


        return "";

    }


    public static void main(String[] args) {

        int n = 3;
        int k = 3;


        System.out.println();

        String  result=kthPermutation(n,k);
        System.out.println(result);

    }

}








