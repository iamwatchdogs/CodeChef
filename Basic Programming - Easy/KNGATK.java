// Question Name: Attack on Kingdom
// Problem Code:  KNGATK
// Link:          https://www.codechef.com/DSAPREP_01/problems/KNGATK

import java.util.Scanner;
import java.util.Arrays;

class KNGATK {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int  [] a = new int[n];
            for(int i = 0; i < n; ++i)
                a[i] = scanner.nextInt();
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
