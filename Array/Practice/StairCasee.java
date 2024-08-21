package Array.Practice;

public class StairCasee {
    public static boolean stairCase(int matrix[][],int key)
    {
        int row=0;int cols=matrix.length-1;
        while(row<matrix.length && cols>=0)
        {
            if(matrix[row][cols]==key)
            {
                System.out.println("Key found at index : "+"("+row+","+cols+")");
                return true;
            }
            else if(matrix[row][cols]<key)
            {
                row++;
            }
            else
            {
                cols--;
            }
        }
        System.out.println("Key doesnot found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        stairCase(matrix, 50);
    }
}
