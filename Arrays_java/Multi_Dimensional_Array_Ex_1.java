import java.util.Scanner;

public class Multi_Dimensional_Array_Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating the scanner dynamic input from user
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        // Taking input from user
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();  // store user input
            }
        }

        System.out.println("-------------------*OUTPUT*--------------------------");

        // Printing array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    
}
// OUTPUT:-
// Enter number of rows: 4
// Enter number of columns: 4
// Enter the elements: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 3
// 5
// 7
// 6
// 4
// 5
// 9
// -------------------*OUTPUT*--------------------------
// 1 2 3 4
// 5 6 7 8
// 9 3 5 7
// 6 4 5 9