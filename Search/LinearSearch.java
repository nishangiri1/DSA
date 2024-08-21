package Search;

import java.util.Scanner;

public class LinearSearch {
  public static int search(int arr[],int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,6,5,8,62,3,12};
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the element you want to search for \n");
        int element =scan.nextInt();
        int index=search(arr,element);
        if(index==-1)
        System.out.println("Elemenet not found\n");
        else
        System.out.println("Element found at index:" +index);
        scan.close();
    }
}
