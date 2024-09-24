public class String_reverse {
    public static String ReverseString(String input)
    {
        int i=0;
        char cArray[]=input.toCharArray();
        int j=cArray.length-1;
        while(i<j)
        {
            System.err.println("in loop");
            char temp=cArray[i];
            cArray[i]=cArray[j];
            cArray[j]=temp;
            i++;
            j--;
        }
        String reveString=new String(cArray);
        System.out.println(reveString);
        return reveString;
    }
    public static void main(String[] args) {
        String reveString=ReverseString("HelloWorld");
        System.out.println(reveString);
    }
}
