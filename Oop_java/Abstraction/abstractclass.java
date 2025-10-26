abstract class Car{
    public abstract void drive();

    public void playmusic(){
        System.out.println("playmusic");
    }
}
// class Car{
//     public  void drive(){

//     }

//     public void playmusic(){
//         System.out.println("playmusic");
//     }
// }

class bmw extends Car{
    public void drive(){
        System.out.println("Start the car workon gares and drive");
    }
}

public class abstractclass {
    public static void main(String[] args) {

        Car obj = new bmw();
        obj.drive();
        obj.playmusic();
        
    }
    
}
