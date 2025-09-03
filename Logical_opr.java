public class Logical_opr {
    public static void main(String[] args) {
        int a= 6;
        int b =8;
        int x= 9;
        int y=7;

        //Logical And &&
        boolean result= x>y && a>b;
        System.out.println(result);

        //Logical OR || 
        boolean result1 = x>y || a>b;
        System.out.println(result1);

        //Logical NOT !
        boolean result2= x>y && a>b;
        System.out.println(!result2);

        
    }
    
}
