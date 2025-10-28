// final class Calc{                   //// using final CLASS stop the Inheritance 

//     public final void show(){         //// Using final method stops overriding the method
//         System.out.println("By gowtham");
//     }
//     public  void add(int a , int b){
//         System.out.println(a+b);
//     }
// }
class Calc{
    public void show(){
        System.out.println("By gowtham");
    }
    public  void add(int a , int b){
        System.out.println(a+b);
    }
}
class AdvClac extends Calc{
    public void show(){
        System.out.println("By name");
    }

}

public class Final_keyword{
    public static void main(String[] args) {

        // -->final Variable

        // final int num = 9;
        // num = 98; //// without using final keyword the value of num will be change
        // System.out.println(num);

        AdvClac obj = new AdvClac();
        obj.add(6, 9);

        
    }
}