import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=0;i<num-1;i++)
        {
            for(int k=i;k<num-2;k++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.print("* ");
        for(int i=1;i<num-1;i++)
        {
            System.out.print("* ");
        }
        System.out.print("*");
    }
}
