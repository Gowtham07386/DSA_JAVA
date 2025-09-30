
class Human{
    // private String name = "Gowtham";
    // private int age = 22;
    

    //using the Gatters and setters 

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

  
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age ,Human obj) {
    //     Human obj1 = obj;
    //     obj1.age = age;
    // }
    //   public String getName() {
    //     return name;
    // }
    // public void setName(String name ,Human obj) {
    //     Human obj1 = obj;
    //     obj1.name = name;
    // }

    
}
public class This_keyword{
    public static void main(String[] args) {

        Human obj = new Human();

        // obj.name = "Gowtham";
        // obj.age = 22;

        // obj.setAge(22,obj);
        // obj.setName("Gowtham Koppera",obj);

        obj.setAge(22);
        obj.setName("Gowtham Koppera");

        System.out.println(obj.getName() +" : "+ obj.getAge());
        


    }
}
    

