import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String [] args)
    {
        int arra1[]=new int[1000000];
        int array2[]=new int[1000000];
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=0;
        int arraynextg[]=new int[100000];
        arra1[0]=0;
        array2[1]=1;
        int d=0;
        for(int i=0;i<51;i++)
        {
            k=arra1[i]+array2[i+1];
            arraynextg[d]=k;
            array2[i+2]=arra1[i];
            arra1[i+1]=k;
            d++;
        }
        System.out.println(arraynextg[num-1]);

    }
}
