class A{
    public A(){
        System.out.println("In A constructor");
    }
    public A(int n){
        System.out.println("In Int A constructor");
    }

}
class B extends A{
    public B(){
        super(5);
        System.out.println("In B constructor");
    }
    public B(int n){
        this();
        System.out.println("In int B constructor");
    }

}
public class Super_method {
    public static void main(String[] args) {

        B obj = new B(8);
        obj.equals(obj);
        
    }
    
}
