package DivideAndConquer;

public class MaxRepeatedNumber {
    //BruteForce Approach
    public static int bruteForct(int arr[])
    {
        int majorityCount=arr.length/2;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;i<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                if(count>majorityCount)
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int a[]={2,2,1,1,1,1,2,2};
        System.out.println(bruteForct(a));
    }

}
