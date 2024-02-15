import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hours=n/3600;
        int rsec=n%3600;
        int min=rsec/60;
        int sec=rsec%60;
        System.out.println("H:M:S-"+hours+":"+min+":"+sec);
    }
}