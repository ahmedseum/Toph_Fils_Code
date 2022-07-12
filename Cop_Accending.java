import java.util.Scanner;

public class Cop_Accending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        String [][]crop=new String[1000][1000];
        row=sc.nextInt();
        col=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                crop[i][j]=sc.nextLine();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(crop[i][j]);
            }
        }
    }
}
