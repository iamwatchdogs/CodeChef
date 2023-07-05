// Question Name: Color the Cube
// Problem Code:  COLOR8TEST
// Link:          https://www.codechef.com/DSAPREP_01/problems/COLOR8TEST

import java.util.Scanner;
import java.util.Arrays;

class COLOR8TEST {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long [] x = new long[6];
            int n = scanner.nextInt();
            for(int i = 0; i < 6; ++i){
                x[i] = scanner.nextLong();
            }
            long sum = Arrays.stream(x).sum();
            System.out.println(sum*((int)Math.ceil(n/2.0)));
        }
    }
}
