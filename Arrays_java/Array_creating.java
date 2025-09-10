import java.util.Scanner;

public class Array_creating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating the scanner dynamic input from user
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
        
    }
    
}
