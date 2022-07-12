import java.util.Scanner;

public class Cricket_ball {
    public static void main(String[] args) {
        String Run_Of_The_Over;
        int total_Over;
        Scanner sc=new Scanner(System.in);
        total_Over=sc.nextInt();
        sc.nextLine();
        Run_Of_The_Over=sc.nextLine();
        while(total_Over>0)
        {
            int count=0,balls=0,over=0;;
            for(int i=0;i<Run_Of_The_Over.length();i++)
            {
                if(Run_Of_The_Over.charAt(i)=='W' || Run_Of_The_Over.charAt(i)=='D' || Run_Of_The_Over.charAt(i)=='N')
                {
                    continue;
                }
                else {
                    count++;
                }
            }
            over=count/6;
            balls=count%6;
            if(balls==0&& over>=1)
            {
                System.out.println( over+ " OVER ");
            } else if (balls>0 && over>0) {
                System.out.println(over + " OVER " + balls + " BALL ");
            } else if (over==0&&balls>0) {
                System.out.println(balls + " BALL ");
            }else if (over==0&& balls==0)
            {
                System.out.println(over + " OVER " + balls + " BALL ");
            }
            else {
                System.out.println(count);
            }
            total_Over--;
        }
    }
}