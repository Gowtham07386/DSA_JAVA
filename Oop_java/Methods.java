class college{
    public void Eventname(){
        System.out.println("Indepandence Day");
    }

    public String Coordinators(int num){
        if(num == 70){
        return "In this event 20 coordinators and 50 NCC members are doing the arrangemants"; 
        }else{
            return "Some people are missing";
        }
        
    }
}

public class Methods {
    public static void main(String[] args) {

        college  obj1 = new college();
        obj1.Eventname();
        String str =obj1.Coordinators(60);
        System.out.println(str);
        

    }
    
}
