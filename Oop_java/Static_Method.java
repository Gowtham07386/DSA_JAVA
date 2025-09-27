class Mobile{
    String Brand;
    int price;
    static String name;
    public void show(){
        System.out.println(Brand +" : "+price+" : "+name);
    }
    // public static void show1(){
    //     System.out.println(Brand +" : "+price+" : "+name); // //instance variable not accepted in static method 
    // }
     public static void show1(Mobile obj){
        System.out.println(obj.Brand +" : "+obj.price+" : "+obj.name);
    }
    
}
public class Static_Method {
    public static void main(String[] args) {
        

     Mobile obj1 = new Mobile();
        obj1.Brand = "SamsungS24";
        obj1.price = 79000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.Brand ="Apple16";
        obj2.price = 150000;
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        
    
 }
}