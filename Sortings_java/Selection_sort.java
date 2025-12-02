import java.util.Scanner;

public class Selection_sort {
    public static int[] selectionsort(int[] arr){
        int n =arr.length;

        int minIndex = -1;
        for(int i=0;i<n-1;i++){

            minIndex =i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex]   ;
            arr[minIndex]=arr[i];
            arr[i]=temp;

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
        arr= selectionsort(arr);
        for(int i=0;i<n;i++){

        System.out.print(arr[i]+" ");
        }
    }
    
}
