import java.util.Scanner;

public class Formationg_Numbers {
    public static void main(String[] args) {
        String numbers;
        Scanner sc = new Scanner(System.in);
        numbers = sc.nextLine();
        int n=0;
        for(int i=numbers.length()-1;i>=0;i--)
        {
            System.out.print(numbers.charAt(n));
            n++;
            if(i%3==0 && i!=0)
            {
                System.out.print(',');
            }
        }

    }
}
