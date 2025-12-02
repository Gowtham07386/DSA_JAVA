enum Status{ //Status is a class 
    Running, Pending, Success, Failed; // objects
}
public class Enum_if_Else_Switch {
    public static void main(String[] args) {
        // int i = 26;
        Status s = Status.Running;

        // if(s == Status.Pending){
        //     System.out.println("Please Wait");
        // }
        // else if(s==Status.Failed){
        //     System.out.println("Please Try Again");
        // }
        // else if(s==Status.Running){
        //     System.out.println("All Good");
        // }
        // else{
        //     System.out.println("Done");
        // }

        System.out.println(s.getClass().getSuperclass());


        switch (s) {
            case Pending:
                System.out.println("Please Wait");
                break;
            case Running:
                System.out.println("All Goodt");
                break;
                
            case Failed:
                System.out.println("Please Try Again");
                break;       
            default:
                System.out.println("Done");
                break;
        }
  }
}


