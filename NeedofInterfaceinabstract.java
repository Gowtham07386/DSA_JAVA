// abstract class Computer{
//     public abstract void code();

//     }
// class Laptop extends Computer{
//     public void code(){
//         System.out.println("Code, compile, run");
//     }
// }
// class Desktop extends Computer{
//     public void code(){
//         System.out.println("Code, compile, run : Faster ");
//     }
// }

// class Developer{
//     public void devapp(Computer lap){
//         lap.code();
//     }
// }

interface  Computer{
     void code();

    }
class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile, run : Faster ");
    }
}

class Developer{
    public void devapp(Computer lap){
        lap.code();
    }
}
public class NeedofInterfaceinabstract{
    public static void main(String[] args) {

        Computer lap =new Laptop();
        Computer desk = new Desktop();
        Developer Gowtham = new Developer();
        Gowtham.devapp(lap);

        Gowtham.devapp(desk);


    }
    
}
