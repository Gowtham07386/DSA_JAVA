package Encapsulation;
class Mobile{
    String Brand;
    int price;
    String name;
    public void show(){
        System.out.println(Brand +" : "+price+" : "+name);
    }
}
public class static_varible {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.Brand = "SamsungS24";
        obj1.price = 79000;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.Brand ="Apple16";
        obj2.price = 150000;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();
        
    }
    
}
