import java.util.Scanner;

public class Big_Factorial {
    public static void main(String[] args) {
        long num,finaln;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        long sum=1;
        for(int i=1;i<=num;i++)
        {
            sum*=i;
        }
        finaln=sum%10000;
        System.out.print(finaln);
    }
}