class D{
    public void show(){
        System.out.println("D show");
    }
}

public class AnonymousInnerclass {
    public static void main(String[] args) {

        D obj =new D()  //the method in the obj is called Anonymous Inner class
        {
            public void show(){
             System.out.println("This is new D show");
            }
        };
        obj.show();
        
    }
    
}
