package GreedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static int minAbsoluteDifference(int a[],int b[])
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff=0;
        for(int i=0;i<a.length;i++)
        {
            minDiff=Math.abs(a[i]-b[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};
        System.out.println();
        System.out.println("Min absolute difference is: "+minAbsoluteDifference(a, b));
    }
}
