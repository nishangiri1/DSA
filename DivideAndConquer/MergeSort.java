package DivideAndConquer;

public class MergeSort {
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        return;
        int mid=(si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;//itterator for left array
        int j=mid+1;//itterator for righr array
        int k=0;//itterator for temp
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while (j<=ei)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,2,7,5,9,8};
        printArr(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        printArr(arr);
    }
}
