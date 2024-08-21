package Recursion;

public class XtodPowerN {
    public static int powerCalulate(int x,int n)
    {
        if(n==0)
        return 1;
        return x*powerCalulate(x,n-1);
    }
    public static int Optimize(int x,int n)
    {
        if(n==0)
        return 1;
        int half=Optimize(x,n/2);
        int halfPower=half*half;
        if(n%2!=0)
        halfPower=x*halfPower;
        return halfPower;
    }
    public static void main(String[] args) {
        System.out.println(powerCalulate(2, 5));
        System.out.println(Optimize(2,5));
    }
}
