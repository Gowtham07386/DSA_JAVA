@FunctionalInterface
interface f_interface{
    void show();
}

// class f1_interface implements f_interface{
//     public void show(){
//         System.out.println("This is f_interface show");
//     }

// }

public class Functional_Interface {
    public static void main(String[] args) {
        f_interface obj = new f_interface() 
        {
        public void show(){
        System.out.println("This is f_interface show");
        }
            
        };
        obj.show();

        
    }
    
}
