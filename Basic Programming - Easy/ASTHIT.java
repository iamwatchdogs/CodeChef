// Question Name: Asteroid Hit
// Problem Code:  ASTHIT
// Link:          https://www.codechef.com/DSAPREP_01/problems/ASTHIT

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ASTHIT {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while(t-->0){
            
            int n = scanner.nextInt();
            int [] dir = new int[n];
            long [] a = new long[n];
            
            for(int i = 0; i < n; i++){
                dir[i] = scanner.nextInt();
                a[i] = scanner.nextLong();
            }
            
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> survivedAsteroids = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                if (dir[i] == 1) {
                    stack.push(i);
                } else {
                    while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                        a[i] += a[stack.peek()];
                        stack.pop();
                    }
                    if (!stack.isEmpty()) {
                        if (a[stack.peek()] == a[i]) {
                            stack.pop();
                        } 
                        else {
                            a[stack.peek()] += a[i];
                        }
                    } else {
                        survivedAsteroids.add(i);
                    }
                }

            }
            
            while(!stack.isEmpty()){
                survivedAsteroids.add(stack.pop());
            }
            
            Collections.sort(survivedAsteroids);
            
            System.out.println(survivedAsteroids.size());
            if(survivedAsteroids.size() > 0){
                for(int i : survivedAsteroids){
                    System.out.print(i + 1 + " ");
                }
            }
        }
    }
}
