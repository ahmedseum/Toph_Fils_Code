import java.util.Scanner;

public class Maximum_NUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit;
        limit=sc.nextInt();
        int number[]=new int[limit];
        int a=number[0];
        for(int i=0;i<limit;i++)
        {
            number[i]=sc.nextInt();
        }
        for(int i=1;i<limit;i++)
        {
            if(a<=number[i])
                a=number[i];
        }

        System.out.print(a);
    }
}
