import java.text.DecimalFormat;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        double h,m,disco=0;
        Scanner sc= new Scanner(System.in);
        h=sc.nextInt();
        m=sc.nextInt();
        h=(12-h)*5;
        double t=h+m;
        double f=t-(m/12);
        double total= f*6;
        if(total>=180)
        {
            disco =360-total;
            System.out.printf("%.7f", disco );
        }
        else if (total<180){
            System.out.printf("%.7f", total);
        }
    }
}
