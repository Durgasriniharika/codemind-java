import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%100;
        String format = String.format("%02d", last);
        System.out.println(format);
    }
}