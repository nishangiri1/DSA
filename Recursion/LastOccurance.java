package Recursion;

public class LastOccurance {
    public static int lastOccurance(int arr[],int i,int key)
    {
        if(i==0)
        return -1;
        if(arr[i]==key)
        return i;
        return lastOccurance(arr, i-1, key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,3,5};
        System.out.println(lastOccurance(arr, arr.length-1, 5));
    }
}
