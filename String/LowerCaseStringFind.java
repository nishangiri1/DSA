package String;

public class LowerCaseStringFind {
    public static int lowerCaseStringFind(String str)
    {
        int total=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          total++;
        }
       
        return total;
    }
    public static void main(String[] args) {
        String str="nishan giri";
        System.out.println(lowerCaseStringFind(str));
    }
}
