interface A {

    int age = 22;  // Here variable are "Finall" and Static
    String area = "Vadodara";

    void show();
    void config();
     
}
class B implements A{
    public void show(){
        System.out.println("interface show ");
    }
    public void config(){
        System.out.println("interface config");
    }
}
public class Interface {
    public static void main(String[] args) {

        A obj;
        obj =new B();

    obj.show();
    obj.config();
    System.out.println(A.area);
    System.out.println(A.age);
        
    }
    
}
