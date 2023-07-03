// Question Name: Three Number Expression Scored
// Problem Code:  EXPRESSION_3
// Link:          https://www.codechef.com/DSAPREP_01/problems/EXPRESSION_3

import java.util.Scanner;

class EXPRESSION_3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            System.out.println( ( a+b == c || b+c == a || a+c == b ) ? "YES" : "NO" );
        }
    }
}
