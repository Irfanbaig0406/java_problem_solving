
import java.util.Arrays;
public class LongestCommonString {
    static String longestCommonPrefix(String[] strs)
    {
        if(strs==null || strs.length==0)
           return "";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=first.length();
        int c=0;
        while(c<i && first.charAt(c)== last.charAt(c))
        {
            c++;
        }
        return c==0? "": first.substring(0,c);
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        String arr[]={"geeksforgeeks", "geeks", "geek",
                          "geezer" };
        System.out.println("The longest common prefix is: "
                           + longestCommonPrefix(arr));
    }
}
