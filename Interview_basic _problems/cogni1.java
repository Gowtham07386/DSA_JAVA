import java.util.Scanner;

public class cogni1 {
    public static int specialSubarr(int[] arr){
    int n =arr.length;
    int count =0;
    for(int i =0; i<n-2;i++){
        if(arr[i]+arr[i+2] == arr[i+1]){
            count++;
        }
    }
    return count;

}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int result = specialSubarr(arr);
        System.out.println(result);
    }
    
}
