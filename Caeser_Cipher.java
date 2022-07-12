import java.util.Scanner;

public class Caeser_Cipher {
    public static void main(String[] args) {
        String d;
        int dif;
        Scanner sc = new Scanner(System.in);
        dif = sc.nextInt();
        sc.nextLine();
        d = sc.nextLine();
        //System.out.println((int)d.charAt(0)-97);
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == ' ') {
                System.out.print(" ");
            } else {

                int cc = (int) d.charAt(i) - 97;
                int f = cc - dif;
                if (f < 0) {
                    int f1 = 25 + f;
                    System.out.print((char) (f1 + 98));
                } else {
                    System.out.print((char) (f + 97));
                }
            }
        }
    }
}
