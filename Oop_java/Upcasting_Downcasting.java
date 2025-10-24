class A{
    public void show(){
        System.out.println("In show A");
    }

}
class B extends A{
    public void show1(){
        System.out.println("In show B");
    }
}
public class Upcasting_Downcasting {
    public static void main(String[] args) {

        A obj = (A) new B(); // is called upcasting

        obj.show();

        B obj1 = (B) obj; // Is called Downcasting
        obj1.show1();

        
        
    }
    
}
