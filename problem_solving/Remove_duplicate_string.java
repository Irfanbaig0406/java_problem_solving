public class Remove_duplicate_string{
   public static String distinctString(String input)
    {
        StringBuilder distinct_String=new StringBuilder();
        for(char ch: input.toCharArray())
        {
            if(distinct_String.indexOf(String.valueOf(ch))==-1)
               distinct_String.append(ch);
        }
        return distinct_String.toString();
    }

    public static void main(String[] args) {
    String result= distinctString("rahulmore");
    System.out.println(result);    
    }
}