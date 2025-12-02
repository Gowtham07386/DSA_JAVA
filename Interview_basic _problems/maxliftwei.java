import java.util.Scanner;
import java.util.*;

public class maxliftwei {

    public static int maxpeople(int[] arr, int maxliftcap){
       Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int sum =0;
        for(int i=0;i<n;i++){
            if(sum <= maxliftcap){
                sum += arr[i];
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the liftcapacity");
        int maxliftcap = sc.nextInt();
        System.out.println("Enter the peoples size");
        int n =sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter the weights of peoples");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = maxpeople(arr, maxliftcap);
        System.out.println("maxPeoples:"+result);
    }
    
}
