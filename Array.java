import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // int marks[]=new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=95;
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(marks[i]);





        // }
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int marks[]=new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     marks[i]=sc.nextInt();
        // }
        //    for(int i=0;i<size;i++)
        // {
        //     System.out.println(marks[i]);
        // }
        // sc.close();


        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); 
        int marks[]=new int[size];
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }
        int x=sc.nextInt();
           for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==x)
            {
                System.out.println("x found at index: " + i);
            }
        }
        

        sc.close();
    }
}
