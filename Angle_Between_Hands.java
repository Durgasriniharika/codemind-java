import java.util.*;
public class Example{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        String[] times=t.split(":");
        int h=Integer.parseInt(times[0]);
        int m=Integer.parseInt(times[1]);
        
        if(h==12){
            h=0;
        }
        
        double mint_ang=6*m;
        double hour_ang=30*h+0.5*m;
        
        double angle_diff=Math.abs(hour_ang-mint_ang);
        
        double min_angle=Math.min(angle_diff, 360-angle_diff);
        
        System.out.println(min_angle);
    }
}