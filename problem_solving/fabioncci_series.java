public class fabioncci_series {
    public static void FabioncciSeries(int num)
    {
        int num1=0,num2=1;
        while(num1<=num)
        {
            System.out.print(num1+" ");
            int sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
      FabioncciSeries(55);
        
    }
}
