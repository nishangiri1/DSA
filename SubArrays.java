public class SubArrays {
    public static void subArrays(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
    
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                currSum=0;   
                // System.out.print("( ");
                for(int k=i;k<=j;k++)
                {
                    // System.out.print(+numbers[k]+" ");
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
                if(minSum>currSum)
                {
                    minSum=currSum;
                }
                // System.out.print(" )");
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("Max sum: "+maxSum);
        System.out.println("Min sum: "+minSum);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        subArrays(array);
    }
}
