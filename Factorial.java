import java.util.Scanner;
public class Factorial {
    public static void factorial_Of_Num(int n) {
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("The factorial of number is: ");
        factorial_Of_Num(a);
        sc.close();
    }
}
