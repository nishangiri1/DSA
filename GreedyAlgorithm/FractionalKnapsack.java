package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]={10,60,50,70,80};
        int weight[]={10,10,5,10,5};
        int w=30;

        double ratio[][]=new double[val.length][2];

        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));


        int capacity=w;
        int finalValue=0;
        for(int i=ratio.length-1;i>=0;i--)
        {
            int index=(int)ratio[i][0];
            if(capacity>=weight[index])
            {
                finalValue+=val[index];
                capacity-=weight[index];
            }
            else
            {
                finalValue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(finalValue);
    }

}
