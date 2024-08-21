package Search;

import java.util.Scanner;

class BinarySearch
{
    public static int binarySearch(int arr[],int left,int right,int element)
    {
        if(left>right)
        {
            return -1;
        }
        int mid=(left+right)/2;
        if (element==arr[mid])
        {
            return mid;
        }
        else if(element<arr[mid])
        {
           return binarySearch(arr,left,mid-1,element);
        }
        else
        {
          return  binarySearch(arr, mid+1, right, element);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,8,9,12,14,15,35,56,67,68};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int n=scanner.nextInt();
        int index=binarySearch(arr,0,arr.length-1,n);
        if(index==-1)
        {
            System.out.println("Index not found");
        }
        else
        {
            System.out.println("Element found at index "+index);
        }
        scanner.close();
    }
}