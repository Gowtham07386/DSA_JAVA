// finding the no of ways to reach the destination in the MxM matrix
import java.util.Scanner;

public class gridmxm {

    public static int countways(int i, int j, int n){
    if( i >= n || j >= n){
        return 0;
    }
    if(i == n-1 && j==n-1){
        return 1;

    }
    int rightways = countways(i, j+1, n);
    int downways = countways(i+1, j, n);
    return rightways+downways;
}
    public static void solve(int n){
    int ans = countways(0,0,n);
        System.out.println("The total no.of ways :"+ans);



}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);

        
    }
    
}
