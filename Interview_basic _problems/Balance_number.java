import java.util.*;
import java.util.Scanner;;

public class Balance_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =s.length();
        

        if(n % 2 ==0){
            System.out.println("Not Balance");
        }else{
             int mid =n/2;
             int ls =0,rs=0;
             
             for(int i=0; i<mid; i++){
                ls = ls+ s.charAt(i)-'0';

             }
             for(int i =mid+1;i<n;i++){
                rs = rs+s.charAt(i)-'0';

             }

             if(ls == rs){
                System.out.println("Balance");
             }else{
                System.out.println("Not Balance");
             }
        }

    
    }
    
}
