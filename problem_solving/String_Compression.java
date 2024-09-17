public class String_Compression {
    static String StringCompression(String str) {
        if(str.length()<2)
          return str;
      StringBuilder sb = new StringBuilder("");
      int count = 1;
      for (int i = 0; i < str.length() - 1; i++) {
          if (str.charAt(i) == str.charAt(i + 1)) {
              count++;
          } else {
              sb.append(str.charAt(i));
              if (count > 1)
                  sb.append(count);
              count = 1;
          }
      }
      // Handle the last character
      sb.append(str.charAt(str.length() - 1));
      if (count > 1)
          sb.append(count);
      return sb.toString();
  }
  
  public static void main(String[] args) {
      System.out.println("Try programiz.pro");
      System.out.println("Compressed string: " + StringCompression("aabcccccaaa"));
  }
   }
