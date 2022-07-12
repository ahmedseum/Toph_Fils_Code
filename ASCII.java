import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        double num;
       num= sc.nextDouble();
       int fl=(int)Math.floor(num);
       int loop=fl/10;
       int finall=(int)Math.floor(loop);
        System.out.print("[");
        for(int i=0;i<finall;i++)
        {
            System.out.print("+");
        }
        for(int i=0;i<(10-finall);i++)
        {
            System.out.print(".");
        }
        System.out.print("]");
        System.out.print(" "+fl+"%");
    }
}
