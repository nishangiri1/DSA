package DivideAndConquer;

public class QuickSort {
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        return;
        int pInd=partition(arr,si,ei);
        //left part
        quickSort(arr, si, pInd-1);
        //right part
        quickSort(arr, pInd+1, ei);

    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=0;j<ei;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,7,5,9,8};
        printArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

