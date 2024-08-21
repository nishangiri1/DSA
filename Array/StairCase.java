package Array;

public class StairCase {
    public static boolean stairCase(int matrix[][],int key)
    {
        int row=0;int cols=matrix[0].length-1;

        while(row < matrix.length && cols>=0)
        {
            if(matrix[row][cols]==key)
            {
                System.out.println("Key found at index :("+row+","+cols+")");
                return true;
            }
            else if(key<matrix[row][cols])
            {
                cols--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        stairCase(matrix, 33);
    }
}
