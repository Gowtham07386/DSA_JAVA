package Encapsulation;
class Human{
    // private String name = "Gowtham";
    // private int age = 22;
    
    private String name;
    private int age;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name =n;
    }
}
public class Encapsulation{
    public static void main(String[] args) {

        Human obj = new Human();

        // obj.name = "Gowtham";
        // obj.age = 22;

        obj.setAge(22);
        obj.setName("Gowtham Kopperag");

        System.out.println(obj.getName() +" : "+ obj.getAge());
        


    }
}