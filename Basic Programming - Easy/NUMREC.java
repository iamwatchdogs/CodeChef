// Question Name: Number of Rectangles
// Problem Code:  NUMREC
// Link:          https://www.codechef.com/DSAPREP_01/problems/NUMREC

import java.util.Scanner;

class NUMREC {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long m = scanner.nextLong();
            long n = scanner.nextLong();
            System.out.println((n*(n+1)*m*(m+1)/4)-m*n);
        }
    }
}
