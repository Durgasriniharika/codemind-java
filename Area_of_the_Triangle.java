import java.util.Scanner;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        double s=(a+b+c)/2;
        double total=(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(s*total);
        System.out.printf("%.2f",area);
    }
}