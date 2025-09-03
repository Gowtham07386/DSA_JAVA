class Hello{
    public static void main(String args[]){
        System.out.println("Hello World!");

        // sample sum of two variables

        int num = 5;
        int num1 = 9;
        int result = num + num1;
        System.out.println("Sum of two variables num "+num+" and num1 "+num1+": ");
        System.out.println(result);
        
        //Primitive examples
        int a = 5;
        short b = 509;
        long l= 23455432l;
        byte by = 127;

        float  f = 7.9f;
        double d = 7.8;
        
        char c='9'; // Literals

        boolean j = true;
       
        // literals

        int x = 0b1011; //Byte code
        System.out.println(x);

        int num2 = 0x7E;
        System.out.println(num2);

        int num3 = 1_00_00_00_000;
        System.out.println(num3);


        double num4 = 12e10;
        System.out.println(num4);




    }
}