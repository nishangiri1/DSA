import java.util.Scanner;

public class Resursion1 {
    public static int calFactorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int fact_1=calFactorial(n-1);
        int fact_n=n*fact_1;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=calFactorial(n);
        System.out.println(ans);
        sc.close();
    }
}
