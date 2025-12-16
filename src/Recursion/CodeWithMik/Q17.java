package Recursion.CodeWithMik;

public class Q17 {

    String[] below20 = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    String[] below100 = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num) {

        if (num == 0) return "Zero";

        return convert(num).trim();


    }

    private String convert(int num) {

        // Time Complexity (TC): O(1)
        // Space Complexity (SC): O(1)

        if (num < 20) return below20[num];

        if (num < 100) return below100[num / 10] + (num % 10 != 0 ? " " + convert(num % 10) : "");

        if (num < 1000) return below20[num / 100] + " Hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");

        if (num < 1_000_000)
            return convert(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");

        if (num < 1_000_000_000)
            return convert(num / 1_000_000) + " Million" + (num % 1_000_000 != 0 ? " " + convert(num % 1_000_000) : "");

        return convert(num / 1_000_000_000) + " Billion" + (num % 1_000_000_000 != 0 ? " " + convert(num % 1_000_000_000) : "");
    }


    public static void main(String[] args) {

        Q17 obj=new Q17();

        System.out.println(obj.numberToWords(98675));


    }
}
