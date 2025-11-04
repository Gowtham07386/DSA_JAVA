enum laptop{
    
    Macbook(2000), XPS(2039), Surphase, Thinkpad(1856);

   
    private laptop() {
        price = 500;
    }

    private int price;

    private laptop(int price) {
        this.price = price;
        System.out.println("in laptop"+this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}

public class EnumClass {
    public static void main(String[] args) {

    // laptop lap = laptop.Macbook;
    // System.out.println(lap+" : "+lap.getPrice());

    for(laptop lap:laptop.values()){
        System.out.println(lap+" : "+lap.getPrice());

    }
    
    }
}
