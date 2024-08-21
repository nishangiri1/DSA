import java.util.Scanner;
public class Percent {
        public static void main(String[] args)
    {
     
        System.out.println("Enter the marks of the subject");
        Scanner get=new Scanner(System.in);
        int maths= get.nextInt();
        System.out.println("");
        int science=get.nextInt();
        System.out.println("");
        int english=get.nextInt();
        System.out.println("");
        int computer=get.nextInt();
        System.out.println("");
        int Nepali=get.nextInt();
        float ttl=maths+science+english+computer+Nepali;
        float percentage=(ttl/500)*100;
        System.out.println("The percentage of the student is");
        System.out.println(percentage);
        get.close();

    }
}
