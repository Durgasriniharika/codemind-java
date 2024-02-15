import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hours=n/3600;
        int rhours=n%3600;
        int min=rhours/60;
        int rmin=rhours%60;
        int sec=rmin/1;
        System.out.println("H:M:S-"+hours+":"+min+":"+sec);
    }
}