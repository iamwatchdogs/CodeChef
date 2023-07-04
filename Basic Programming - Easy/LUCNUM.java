// Question Name: Lucky Number
// Problem Code:  LUCNUM
// Link:          https://www.codechef.com/DSAPREP_01/problems/LUCNUM

import java.util.Scanner;

class LUCNUM {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long n = scanner.nextLong();
            System.out.println( isPrimeFactor(n) );
        }
    }
    public static int isPrimeFactor (long n) {
      int counter = 0;
      while(n%2 == 0){
          n /= 2;
          counter++;
      }
      return (counter%2 == 0) ? 1 : 0;
    }
}
