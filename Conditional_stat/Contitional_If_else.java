import java.util.Scanner;

public class Contitional_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<=20 && x>=10){
            System.out.println("x is present b/w 10-20 :"+x);
        }else if(x>20){
            System.out.println("x is greater then 20");
        }else if(x<10){
            System.out.println("x is less then 10");
        }
        
        else{
            System.out.println("x is not present b/w 10-20");
        }
        
    }
    
}
