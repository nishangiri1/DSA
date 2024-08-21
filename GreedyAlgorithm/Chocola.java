package GreedyAlgorithm;
import java.util.Arrays;
import java.util.Collections;
public class Chocola {
    public static void main(String[] args) {
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<costHor.length && v<costVer.length)
        {
            if(costHor[h]<=costVer[v])
            {
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
            else
            {
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }
        }
        while (h<costHor.length ) {
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length)
        {
            cost+=costVer[v]*vp;
            hp++;
            v++;
        }
        System.out.println("Total cost is: "+cost);
    }
}
