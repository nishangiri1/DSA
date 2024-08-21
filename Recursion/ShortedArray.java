package Recursion;

public class ShortedArray {
    public static boolean sortedArray(int arr[],int i)
    {
        if(i==arr.length-1)
            return true;
        if(arr[i]>arr[i+1])
        return false;
        return sortedArray(arr,i+1);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,6,5};
        System.out.println(sortedArray(array,0));

    }
}
