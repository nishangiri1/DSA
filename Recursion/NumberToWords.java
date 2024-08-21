package Recursion;

public class NumberToWords {
    private static final String[] digits = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static String numberToWords(int n) {
        if (n == 0) {
            return "";
        } else {
            return numberToWords(n / 10) +" "+ digits[n % 10];
        }
    }

    public static void main(String[] args) {
        int number = 55; 
        System.out.println(numberToWords(number));
    }
}

