abstract class A{
    public abstract void show();
}
// class B extends A{
//     public void show(){
//         System.out.println("In show class A");
//     }
// }

public class abstract_anonymousclass {
    public static void main(String[] args) {

        A obj =new A()  //the method in the obj is called Anonymous Inner class
        {
            public void show(){
             System.out.println("This is new D show");
            }
        };
        obj.show();
        
 }
}
