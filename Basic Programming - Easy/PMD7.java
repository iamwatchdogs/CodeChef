// Question Name: Power M divisibility by 7
// Problem Code:  PMD7
// Link:          https://www.codechef.com/DSAPREP_01/problems/PMD7

import java.util.Scanner;

class PMD7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long x = scanner.nextLong();
            int m = scanner.nextInt();
            System.out.println( isDivisibleBy7( powerUpEachDigit(x,m) ) ? "YES" : "NO" );
        }
    }
    public static long powerUpEachDigit(long x, int m){
        long num = 0;
        int power = (m%4==0 && m!=0) ? power = 4 : m%4;
        while(x != 0){
	        num = num*10 + (int)Math.pow(x%10,power)%10;
	        x /= 10;
	    }
        return num;
    }
    public static boolean isDivisibleBy7(long num){
        return num%7 == 0;
    }
}
