// Question Name: Taxi Cost
// Problem Code:  RAIN8TEST
// Link:          https://www.codechef.com/DSAPREP_01/problems/RAIN8TEST

import java.util.Scanner;

class RAIN8TEST {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-->0){
            
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            
            int [] d = new int[n];
            for(int i = 0; i < n; ++i){
                d[i] = scanner.nextInt();
            }
            
            int cost = (d[0] == 0) ? 0 : 1;
            
            for(int i = 1; i < n; ++i){
               if(d[i-1] == 1 || d[i] == 1){
                   cost++;
               }
            }
            
            System.out.println(cost*x);
        }
    }
}
