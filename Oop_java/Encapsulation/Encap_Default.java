package Encapsulation;
class Student{
    String name;
    int age;

    public Student() //default Constructor
    {
        name = "Gowtham";
        age = 22;
    }

    public Student(String n,int a) //Parametarised constructor
    {
        name = n;
        age = a;

        
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
public class Encap_Default {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Rishitha",7);
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
        obj.setAge(19);
        obj.setName("Buvan chandra");

        System.out.println(obj.getName()+" : "+obj.getAge());
        
    }
    
  



    
}



