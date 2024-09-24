public class Array_MaxSum {
    public static void MaxSum(int num[])
    {
        int currsum=num[0];
        int maxsum=num[0];
        for(int n: num)
        {
            currsum=Math.max(n,currsum+n);
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
         // int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
          int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
          MaxSum(arr);        
    }
}
