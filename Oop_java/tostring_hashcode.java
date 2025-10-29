class Laptop{
    String model;
    int price;

    public String toString(){
        return model +" : "+price;
    }

    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model)&& this.price == that.price)
            return true;
        else
            return false;
        
    }


}
public class tostring_hashcode {
    public static void main(String[] args) {
        
    
   Laptop obj = new Laptop();
   obj.model = "HP windows 13 RYZEN_6";
   obj.price = 1000;

   Laptop obj1 = new Laptop();
   obj1.model = "HP windows 13 RYZEN_6";
   obj1.price = 1000;

   boolean result = obj.equals(obj1);
   System.out.println(result);
   System.out.println(obj.toString()); //if the tostring method is not present in can exists toString using "getClass().getName() + '@' + Integer.toHexString(hashCode());"
    
}
}
