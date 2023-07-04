// Question Name: Defeat The Monster 1
// Problem Code:  MONSTER1
// Link:          https://www.codechef.com/DSAPREP_01/problems/MONSTER1?tab=statement

import java.util.Scanner;

class MONSTER1{
    
	public static void main (String[] args) throws java.io.IOException {
	    try {
    		Scanner in = new Scanner ( System.in );
    		int t = in.nextInt();
    		while(t-->0){
    		    long h = in.nextLong();
    		    long x = in.nextLong();
    		    long y = in.nextLong();
    		    System.out.println((x > y) ? 1 : 0);
    		}
	    } catch (Exception e) {
	        return ;
	    }
	}
}
