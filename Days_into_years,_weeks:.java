import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int years=x/365;
        int rdays=x%365;
        int weeks=rdays/7;
        int r1days=rdays%7;
        System.out.println(years);
        System.out.println(weeks);
    }
}