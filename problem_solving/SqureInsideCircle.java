import java.util.*;
public class SqureInsideCircle {

   static double squreInsideCircle(double rad)
   {
    double res=rad*Math.sqrt(2);
      return res*res;
   } 
   public static void main(String args[])
   {
      System.out.println("Squre area inside Circle: "+squreInsideCircle(5));
   } 
}
