import java.util.*;
public class Palindrome {
    public static void main(String [] args)
    {
        String word;
        int k=0;
        char []aray=new char[100];
        try (Scanner sc = new Scanner(System.in)) {
            word= sc.nextLine();
        }

        int length=word.length();
        for(int i=(length-1);i>=0;i--)
        {
         aray[k]=word.charAt(i);
         k++;
        }
        
        int point=0;
        for(int j=0;j<word.length();j++)
        {
            if(aray[j]!=word.charAt(j))
            {
                point++;
            }
        }
        if(point==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
