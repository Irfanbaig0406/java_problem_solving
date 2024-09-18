/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example:
Input: s = "anagram", t = "nagaram"
Output: true
*/
import java.util.*;
public class Valid_anagram_strings{
    
    public static boolean Anagram_String(String s,String t){
        if(s.length()!= t.length()){
            return false;
        }
            char[] new_t = t.toCharArray();
            char[] new_s = s.toCharArray();
            Arrays.sort(new_s);
            Arrays.sort(new_t);
    
            return Arrays.equals(new_s, new_t);
        }
    
        public static void main(String[] args) {
            if (Anagram_String("race", "carrace")) {
                System.out.println("S is a valid anagram of t string");
            } else {
                System.out.println("S is not a valid anagram.");
            }
    }
}