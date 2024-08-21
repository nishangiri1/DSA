import java.util.Scanner;
public class Function1 {
    public static void sumTwoNumber(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The sum of two number is ");
        sumTwoNumber(x, y);
        sc.close();
    }
}
