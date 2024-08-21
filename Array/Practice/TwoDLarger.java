package Array.Practice;

import java.util.Scanner;

public class TwoDLarger {
    public static int largerElement(int matrix[][])
    {
        int larger=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>larger)
                {
                    larger=matrix[i][j];
                }
            }
        }
        return larger;

    }
    public static int smallestElement(int matrix[][])
    {
        int smallestElement=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<smallestElement)
                {
                    smallestElement=matrix[i][j];
                }
            }
        }
        return smallestElement;
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The largest element in matrix is: "+largerElement(matrix));
        System.out.println("The smallest element in matrix is: "+smallestElement(matrix));
        sc.close();
    }
    }
