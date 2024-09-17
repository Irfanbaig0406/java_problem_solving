import java.util.Set;
import java.util.HashSet;

public class LongestNonRepeatingString {
    public static int NonRepeatingSubstring(String s) {
        Set<Character> uniquechar = new HashSet<>(); // Initialize a HashSet of Characters
        int end = 0;
        int st=0;
        int longest=0;
        int n=s.length();
       if(s==null || s.equals(""))
            return 0;
        
        while(st<n)
        {
            if(!uniquechar.contains(s.charAt(st)))
            {
                uniquechar.add(s.charAt(st));
                  st++;
                  longest=Math.max(longest,uniquechar.size());
            }else
            {
                uniquechar.remove(s.charAt(end));
                end++;
            }
        } 
        
        return longest;
    }
    public static void main(String[] args) {
        //String s="abcabcab";
        String s="bbbbb";
        System.out.println("Length of Non repeating character substring: "+NonRepeatingSubstring(s));
    }
}
