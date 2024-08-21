package Array;

public class ReverseArray {
    public static void reverse(int number[])
    {
        int first=0;int last=number.length-1;
        while(first<last)
        {
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
public static void main(String[] args) {
    int number[]={23,43,33,2,3,44,24,32,29};
    reverse(number);
    System.out.println("Array after reverse is ");
    for(int i=0;i<number.length;i++)
    {
        System.out.println(number[i]+" ");
    }
}
}
