package ArrayListP;
import java.util.ArrayList;

public class FIrstPairs {
    public static boolean find(ArrayList<Integer> num,int target)
    {
        int lp=0;
        int rp=num.size()-1;
        while(lp!=rp)
        {
        if((num.get(lp)+num.get(rp))==target)
        {
            return true;
        }
        else  if((num.get(lp)+num.get(rp))<target)
        lp++;
        else
        rp--;
    }

     return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        int target=10;
        System.out.println(find(num, target));
        
    }
}
