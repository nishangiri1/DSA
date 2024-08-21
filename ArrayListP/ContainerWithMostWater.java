package ArrayListP;
import java.util.ArrayList;

public class ContainerWithMostWater {
    // public static int containerWithMostWater(ArrayList<Integer> height)
    // {
    //     int maxWater=0;
    //     for(int i=0;i<height.size();i++)
    //     {
    //         int a=height.get(i);
    //         for(int j=i+1;j<height.size();j++)
    //         {
    //             int b=height.get(j);
    //             int ht=Math.min(a, b);
    //             maxWater=Math.max(ht*(j-i), maxWater);
    //         }
    //     }
    //     return maxWater;
    // }
    public static int containerWithMostWater(ArrayList<Integer> height)
    {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int ht=Math.min(height.get(lp),height.get(rp));
            maxWater=Math.max(ht*(rp-lp),maxWater);

            //update ptr
            if(height.get(lp)<height.get(rp))
                lp++;
                else
                rp--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
    ArrayList<Integer> height=new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println("Max water is "+containerWithMostWater(height));
    }    
}
