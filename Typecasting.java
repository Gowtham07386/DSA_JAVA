public class Typecasting {
    public static void main(String[] args) {
        
        //converting int to byte code value
        int a = 2345;
        byte b = (byte)a;
        System.out.println(b);

        //Converting float to int value
        float f = 56.9f;
        int  num = (int)f;
        System.out.println(num);

        //Type Promotions 

        byte a1 = 19;
        byte b1 = 30;

        int result = a1 * b1;
        System.out.println(result);


    } 
    
}
