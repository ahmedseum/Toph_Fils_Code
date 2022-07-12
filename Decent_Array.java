import java.util.Scanner;

public class Decent_Array {
    public static void main(String[] args) {
        int [] numList=new int[10000];
        int limit,count=0;
        Scanner sc=new Scanner(System.in);
        limit=sc.nextInt();
        for(int i=0;i<limit;i++)
        {
            numList[i]=sc.nextInt();
        }

        int d=numList[1]-numList[0];
        for(int i=0;i<limit;i++)
        {
            if(numList[i+1]-numList[i]==d)

            {
                count++;
            }
        }
        if(limit==count+1)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }

    }
}
