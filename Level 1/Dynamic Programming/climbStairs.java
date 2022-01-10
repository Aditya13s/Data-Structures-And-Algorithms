import java.util.*;

public class climbStairs {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPaths(n, new int[n+1]);
        System.out.println(cp);
        //System.out.println(countPathsTabulation(n));
    }
    public static int countPaths(int n , int[] q) {
        if(n == 0) {
            return 1;
        } else if(n < 0) {
            return 0;
        }
        
        if(q[n] != 0) {
            return q[n];
        }   
        int cp1 = countPaths(n-1 , q);
        int cp2 = countPaths(n-2 , q);
        int cp3 = countPaths(n-3 , q);
        int cp = cp1 + cp2 + cp3;
        
        q[n] = cp;
        return cp;
    }
    public static int countPathsTabulation(int n) {
        int[] dp = new int[n+1];   
        dp[0] = 1;
        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1];
            } else if(i == 2) {
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}