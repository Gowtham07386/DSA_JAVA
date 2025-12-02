import java.util.Scanner;

public class Bubble_sort {
    public static int[] Bubblesort(int[] arr){
        int n =arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
        
    }
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting :");
        for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
              
        }
        System.out.println();

        System.out.println("After sorting :");
        arr= Bubblesort(arr);
        for(int i=0;i<n;i++){

        System.out.print(arr[i]+" ");
        }
    }
}
