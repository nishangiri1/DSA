package Recursion;

public class SumOfN {
    public static int calculate(int n)
    {
        if(n==1)
        return 1;

        return n+calculate(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calculate(10));
    }
}
