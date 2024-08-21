package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void arraySelectionInSortedEnd()
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(0);

        int lastEnd=end[0];

        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=lastEnd)
            {
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max activities= "+ maxAct);
        for (int index = 0; index < ans.size(); index++) {
            System.out.print("A"+ans.get(index)+" ");
        }
    }

    public static void arraySelectionInUnSortedEnd()
    {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};

        int activities[][]=new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(activities[0][0]);

        int lastEnd=activities[0][2];

        for(int i=1;i<end.length;i++)
        {
            if(activities[i][1]>=lastEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Max activities= "+ maxAct);
        for (int index = 0; index < ans.size(); index++) {
            System.out.print("A"+ans.get(index)+" ");
        }
    }
    public static void main(String[] args) {
    arraySelectionInSortedEnd();
    System.out.println();
    System.out.println();
    arraySelectionInUnSortedEnd();
    
    }
}
