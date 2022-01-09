import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] q = new int[n+1];
        int f = fib(n, q);
        System.out.println(f);
    
    }
 
    public static int fib(int n, int[] q) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(q[n] != 0) {
            return q[n];
        }
        int fibnm1 = fib(n-1, q);
        int fibnm2 = fib(n-2, q);
        int fib = fibnm1 + fibnm2;
        q[n] = fib;
        return fib;
    }
}
