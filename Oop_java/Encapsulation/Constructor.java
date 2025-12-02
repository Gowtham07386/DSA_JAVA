class Human{
   
    
    private String name;
    private int age;

    public Human(){
        age = 22;
        name = "Gowtham";
        // System.out.println("In Constructor");
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public int getAge()
    {
        return age;
    }

    public void setName(String n)
    {
        name =n;
    }

    public String getName()
    {
        return name;
    }

    
}
public class Constructor {
  
public static void main(String[] args) {

        Human obj = new Human();
        System.out.println(obj.getName() +" : "+ obj.getAge());
        obj.setAge(22);
        obj.setName("Gowtham Koppera");

        System.out.println(obj.getName() +" : "+ obj.getAge());
        


    }
}

