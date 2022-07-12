import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number ;
        int point=0;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                point++;
            }
        }
        if(point==0)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
    
