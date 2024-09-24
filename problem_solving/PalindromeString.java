public class PalindromeString {
    public static void palindromeString(String str){
        int left=0; 
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
               System.err.println("Non-palindromic string");
               break;
            }
            left++;
            right--;
        }
        System.err.println("palindrome String");
    }
    public static void main(String[] args) {
        palindromeString("rahul");
    }
}
