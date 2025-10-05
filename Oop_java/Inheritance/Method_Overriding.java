class A{
    public int  add(int a , int b){
        return  a+b;
    }
}
class B extends A
{
    public int add(int a , int b){
        return a+b+1;
    }
}
public class Method_Overriding {
    public static void main(String[] args) {

        B obj = new B();
        int r =obj.add(4,6);
        System.out.println(r);
        
    }
    
}
