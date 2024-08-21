package String;

public class LargestString {
    public static String largeString(String fruit[])
    {
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++)
        {
            if(largest.compareTo(fruit[i])<0)
            {
                largest=fruit[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};


        System.out.println(largeString(fruit));
    }
}
