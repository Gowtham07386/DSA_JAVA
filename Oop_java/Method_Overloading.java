class Calculater{
    public int add(int a, int b){
        
        return a + b;
    }
    public int add(int a, int b,int c){
        
        return a + b + c;
    }
    public double add(double a, int b){
        
        return a + b;
    }
// its called Method overloading------

}
public class Method_Overloading {
    
    public static void main(String[] args) {
        
        Calculater obj = new Calculater();

        int result = obj.add(4,7);

        System.out.println(result);
    }
    
}


