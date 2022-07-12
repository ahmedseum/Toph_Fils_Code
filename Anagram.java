import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String input_1;
        String input_2;
        Scanner sc=new Scanner(System.in);
        input_1=sc.nextLine();
        input_2=sc.nextLine();
        int point=0;
        for(int i=0;i<input_1.length();i++)
        {
            for(int j=0;j<input_2.length();j++)
            {
                if(input_1.charAt(i)==input_2.charAt(j))
                {
                    point++;
                }
            }
        }
        if(point==input_1.length())
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
