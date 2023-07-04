// Question Name: Pixel Damage
// Problem Code:  PIXDAM
// Link:          https://www.codechef.com/DSAPREP_01/problems/PIXDAM

import java.util.Scanner;

class PIXDAM {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(isDistanceLessThanK(h,w,x,y,k));
        }
    }
    public static int isDistanceLessThanK (int h, int w, int x, int y, int k){
        int dist = (int)Math.pow(Math.pow(h-y,2) + Math.pow(w-x,2),0.5);
        return (dist < k) ? 1 : 0;
    }
}
