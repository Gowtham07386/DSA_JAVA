 @FunctionalInterface
interface f_interface{
    void show(int i );
}

// class f1_interface implements f_interface{
//     public void show(){
//         System.out.println("This is f_interface show");
//     }

// }
public class Lamda_FunctionalInterface {
    public static void main(String[] args) {
        
        f_interface obj = (int i) ->System.out.println("This is f_interface show");
        
        obj.show(6);

        
    }
}
    

