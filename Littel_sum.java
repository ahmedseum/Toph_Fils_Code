import java.util.Scanner;

public class Littel_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int limit=sc.nextInt();
        int f_num=sc.nextInt();
        int l_num=sc.nextInt();
        int array[]=new int[10000];
        for (int i=0;i<limit;i++)
        {
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=f_num;j<=l_num;j++)
        {
            sum+=array[j];
        }
        System.out.println(sum);
    }
}
