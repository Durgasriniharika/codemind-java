import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float Basic_sal=sc.nextFloat();
        float HRA=sc.nextFloat();
        float DA=sc.nextFloat();
        float PF=(Basic_sal*12)/(100);
        float Gross_sal=Basic_sal+HRA+DA+PF;
        System.out.printf("%.2f
",PF);
        System.out.printf("%.2f
",Gross_sal);
    }
}