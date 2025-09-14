import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating the scanner dynamic input from user
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];

        System.out.println("---------------------------------------------");

        for(int i =0;i<r;i++){
            
            for(int j =0; j<c;j++){
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        for(int i =0;i<r;i++){
            
            for(int j =0; j<c;j++){
                arr[i][j]= (int)(Math.random()*10); // we use this to print the random values
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for(int n[] : arr){
            for( int m : n){
                System.out.print(m +" ");
            }
            System.out.println();
        }

        
        
    }
    
}

// OUTPUT:-
// 3
// 4
// ---------------------------------------------
// 0 0 0 0
// 0 0 0 0
// 0 0 0 0 
// ----------------------------------------------------------------------------------------------
// 4 8 1 2
// 8 8 3 7
// 7 1 5 3
// -----------------------------------------------------------------------------------------
// 4 8 1 2
// 8 8 3 7
// 7 1 5 3