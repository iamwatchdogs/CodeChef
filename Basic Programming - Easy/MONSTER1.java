// Question Name: Defeat The Monster 1
// Problem Code:  MONSTER1
// Link:          https://www.codechef.com/DSAPREP_01/problems/MONSTER1?tab=statement

import java.util.Scanner;

class MONSTER1 {
    
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
		    int h = in.nextInt();
		    int x = in.nextInt();
		    int y = in.nextInt();
		    System.out.printf("%d\n", (x > y) ? 1 : 0);
		}
	}
}
