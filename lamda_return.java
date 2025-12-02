  @FunctionalInterface
interface A{
    int add(int i ,int j);
}

// class f1_interface implements f_interface{
//     public void show(){
//         System.out.println("This is f_interface show");
//     }

// }
public class lamda_return {
    public static void main(String[] args) {
        
        // A obj = new A(){
        //     public int add(int i,int j){
        //         return i+j;

        //     }

        A obj = (int i,int j) ->  i+j;

        
        int result = obj.add(5, 6);
        System.out.println(result);

        
    }
}
    


    

