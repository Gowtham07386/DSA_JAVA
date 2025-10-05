class calc{
    public int add(int a , int b){
        return a+b;

    }
    public int sub(int a,int b){
        return a -b;
    }
}

class Advcalc extends calc{

    public int multi(int a,int b){
        return a * b;
    }
    public int Div(int a , int b){
        return a /b;
    }
}

class sintcalc extends Advcalc{

    public double power(int a , int b){
        return Math.pow(a, b);
    }

}


public class Multi_level_Inher{
    
    public static void main(String[] args) {
        
        sintcalc obj1 = new sintcalc();
        int mult = obj1.multi(5, 6);
        int  div = obj1.Div(25, 5);
        int add = obj1.add(5,9 );
        int sub = obj1.sub(9,5);

        double power = obj1.power(6,6);

        System.out.println("Addition :"+add+" , "+"Subraction :"+sub+" Multiplication :"+mult+" , "+"Division :"+div);

        System.out.println("Power :"+ power);


    }
    
}

    

