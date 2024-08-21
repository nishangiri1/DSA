package Array;

public class SubArrays {
    public static void subArrays(int number[])
    {
        int current=0;
        int max=Integer.MIN_VALUE;
        int last=number.length;
        for(int i=0;i<last;i++)
        {
            for(int j=i;j<last;j++)
            {
                current=0;
                for(int k=i;k<=j;k++)
                {
                    current+=number[k];
                }
                System.out.println(current);
                if(max<current)
                {
                    max=current;
                }
            }
        }
        System.out.println("Max sum of subarryas is "+max);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subArrays(number);
    }
}
