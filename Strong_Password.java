import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Strong_Password {
    public static void main(String[] args) {
        String input;
        Scanner sc= new Scanner(System.in);
        input=sc.nextLine();
        System.out.print(toUpperCase(input.charAt(0)));
        for(int i=1;i<input.length();i++)
        {
            if(input.charAt(i)=='s')
            {
                System.out.print('$');
            } else if (input.charAt(i)=='i') {
                System.out.print('!');
            } else if (input.charAt(i)=='o') {
                System.out.print("()");
            } else {
                System.out.print(input.charAt(i));

            }
        }
        System.out.println(".");
    }
}
