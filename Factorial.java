import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        long number;
        long[] sum=new long[1000];
        long d=1;
        number =sc.nextLong();
        for(int i=1;i<=number;i++)
        {
            d=d*i;
        }
        System.out.println(d);

    }

}
