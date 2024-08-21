import java.util.Scanner;
public class Recursion {
    public static void printNum(int a,int y,int sum)
    {
        if(y==a)
        {
            sum+=y;
            System.out.println(sum);
            return;
        }
        sum+=y;
        printNum(a,y+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        printNum(n,x,0);
        sc.close();
    }
        
    }

 