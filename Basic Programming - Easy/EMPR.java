// Question Name: Emotional Proximity
// Problem Code:  EMPR
// Link:          https://www.codechef.com/DSAPREP_01/problems/EMPR

import java.util.Scanner;

class EMPR {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.printf("%.10f\n", z == 1 ? p*(100+y)/100.0 : p*(100-x)/100.0);
        }
    }
}
