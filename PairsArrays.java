class PairsArrays
{
    public static void subArrays(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {

                System.out.print("("+number[i]+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arrays[]={2,4,6,8,10};
        subArrays(arrays);
    }
}