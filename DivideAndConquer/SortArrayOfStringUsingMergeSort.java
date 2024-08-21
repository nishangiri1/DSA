package DivideAndConquer;

public class SortArrayOfStringUsingMergeSort {
    public static String[] mergeSort(String[] arr,int lo,int hi)
    {
        if(lo==hi)
        {
            String[] A= {arr[lo]};
            return A;
        }

        int mid=lo+(hi-lo)/2;
        String[] str1=mergeSort(arr, lo, mid);
        String[] str2=mergeSort(arr, mid+1, hi);

        String result[]=merge(str1,str2);
        return result;
    }

    public static String[] merge(String[] str1,String[] str2)
    {
        int m=str1.length;
        int n=str2.length;
        String[] str3=new String[m+n];
        int i=0;int j=0;int indx=0;
        while(i<m && j<n )
        {
            if(isAlphabeticallySmall(str1[i],str2[j]))
            {
                str3[indx]=str1[i];
                i++;
                indx++;
            }
            else
            {
                str3[indx]=str2[j];
                j++;
                indx++;
            }
        }
        while(i<m)
        {
            str3[indx]=str1[i];
            i++;
            indx++;
        }

        while(j<n)
        {
            str3[indx]=str2[j];
            indx++;
            j++;
        }
        return str3;

    }
    public static boolean isAlphabeticallySmall(String str1,String str2)
    {
        if(str1.compareTo(str2)<0)
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String str1[]={"sun","earth","mars","mercury"};
        String result[]=mergeSort(str1,0,str1.length-1);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+",");
        }
    }
}
