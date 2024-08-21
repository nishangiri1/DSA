package Array;

public class PairsInArray {
    public static void pairsinArray(int number[])
    {
        int last=number.length-1;
        for(int i=0;i<last;i++)
        {
            for(int j=i;j<last;j++)
            {
                System.out.print("("+number[i]);
                System.out.print(","+number[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pairsinArray(num);
    }
}
