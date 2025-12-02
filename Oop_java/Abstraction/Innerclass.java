class man{

    int age = 45;

    public void show(){
        System.out.println("He is married man");
    }

    // class father{

    //     public void responsibility(){
    //     System.out.println("He has to childrens and responsibility ");
    //     }
    // }

    static class father{ //static class

        public void responsibility(){
        System.out.println("He has to childrens and responsibility ");
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {

        man obj = new man();
        obj.show();
        System.out.println(obj.age);

        // man.father obj1 = obj.new father(); 
        // obj1.responsibility();

        man.father obj1 = new man.father(); // Creating the object for static inner class no need of obj/mainclass obj 
        obj1.responsibility();


        


    }
    
}
