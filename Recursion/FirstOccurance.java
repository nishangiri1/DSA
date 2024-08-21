package Recursion;

public class FirstOccurance {
    public static int firstOccurance(int arr[],int i,int key)
    {
        if(i==arr.length)
        return -1;
        if(arr[i]==key)
        return i;
        return firstOccurance(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,3,5};
        System.out.println(firstOccurance(arr, 0, 5));

    }
}
