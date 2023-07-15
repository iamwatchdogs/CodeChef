// Question Name: Find Integer
// Problem Code:  FNDINT
// Link:          https://www.codechef.com/DSAPREP_01/problems/FNDINT

import java.util.Scanner;
import java.util.HashSet;

class FNDINT {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long x = scanner.nextLong();
            while(!isPairwiseDifferent(++x));
            System.out.println(x);
        }
    }
    public static boolean isPairwiseDifferent(long x){
        for(HashSet<Integer> set = new HashSet<>(); x !=0; x /= 10) {
            if(set.contains((int)x%10))  return false;
            set.add((int)x%10);
        }
        return true;
    }
}
