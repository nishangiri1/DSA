package Recursion;

public class RemoveDuuplicateString {
    public static void removeDuuplicateString(String str,int index,StringBuilder sb,boolean map[])
    {
        if(index==str.length())
        {
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(index);
        if(map[currChar-'a']==true)
        {
            removeDuuplicateString(str, index+1, sb, map);
        }
        else
        {
            map[currChar-'a']=true;
            removeDuuplicateString(str, index+1, sb.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str="nishan";
        removeDuuplicateString(str, 0, new StringBuilder(), new boolean[26]);

    }
}
