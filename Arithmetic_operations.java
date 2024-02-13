import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum:"+(x+y));
        System.out.println("Difference:"+(x-y));
        System.out.println("Product:"+(x*y));
        System.out.println("Quotient:"+(x/y));
        System.out.println("Remainder:"+(x%y));
    }
}