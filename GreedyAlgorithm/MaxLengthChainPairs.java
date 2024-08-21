package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {
    public static int maxLengthChainPairs(int arr[][])
    {
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        int chainLen=1;
        int chainEnd=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {   
            if(arr[i][0]>chainEnd)
            {
                chainLen++;
                chainEnd=arr[i][1];
            }
        }

        return chainLen;
    }
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,69},{5,28},{27,40},{50,90}};
        System.out.println("The maximum chains of pair can be formed from given array is: "+maxLengthChainPairs(pairs));
    }
}
