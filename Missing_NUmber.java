import java.util.Scanner;

public class Missing_NUmber {
    public static void main(String[] args) {
        int total,sum=0;
        int num[]=new int[3];
        Scanner sc=new Scanner(System.in);
        total=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        System.out.println(total-sum);

    }
}
