// convert Binary to Decimal

import java.util.Scanner;

public class binaryTodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while( a > 0){
            int unit  = a % 10;
            ans += (unit * pw);
            a /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
    
}
