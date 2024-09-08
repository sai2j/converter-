//convert decimal to binary

import java.util.Scanner;

public class decimalTobinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ans = 0;
        int pw = 0;

        while(a > 0) {
            int parity = a % 2;
            ans += 10;
            pw *= 10;
            a /=2;
        }
        System.out.println();
    }
}
