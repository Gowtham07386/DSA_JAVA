public class WrapperClass {
    public static void main(String[] args) {
        
        int num =9;
        //Integer num1 = new Integer(num); //// boxing
        Integer num1 = Integer.valueOf(num);

        Integer num2 = num; //autoboxing


        //int num3 = num2 ////auto-Unboxing

        int  num3 = num2.intValue(); //Unboxing 



        System.out.println(num1);
        System.out.println(num3);


        String str ="25";
        int n = Integer.parseInt(str); //Wrapper class
        System.out.println(n);

    }
    
}
