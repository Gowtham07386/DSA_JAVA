class Calculater{
    public int add(int a, int b){
        System.out.println("Object created");
        int r = a+b;
        return r;
        

    }
}

public class Demo {
    public static void main(String[] args) {
        int a =9;
        int b =8;

        Calculater calc = new Calculater();

        int result = calc.add(a,b);

        System.out.println(result);
    }
    
}
