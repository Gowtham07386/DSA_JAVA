package Encapsulation;
class Mobile{
    String Brand;
    int price;
    static String name;
    static{
        name = "Phone";
        System.out.println("In Static Block"); //static block calls only ones
    }
    public Mobile(){
        Brand = "";
        price = 302;
        System.out.println("In Constructor"); // Constructors calls according to num of objects
    }
    public void show(){
        System.out.println(Brand +" : "+price+" : "+name);
    }
    
    
    
}
public class Static_Block {
    
    public static void main(String[] args) throws ClassNotFoundException
    {

            Class.forName("Mobile");    
                
            


    //  Mobile obj1 = new Mobile();
    //     obj1.Brand = "SamsungS24";
    //     obj1.price = 79000;
    //     Mobile.name = "SmartPhone";

    //  Mobile obj2 = new Mobile();   
        
        
    //     obj1.show();
    
        
    
 }
}

