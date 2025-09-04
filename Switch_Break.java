class Switch_Break{
    public static void main(String[] args) {
        

        //Ex-1---------------------------------------------------------------
        // int n = 2;
        // switch (n){
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     case 4:
        //     System.out.println("Thursday");
        //     break;
        //     case 5:
        //     System.out.println("Friday");
        //     break;
        //     case 6:
        //     System.out.println("Saturday");
        //     break;
        //     case 7:
        //     System.out.println("Sunday");
        //     break;
        //     default:
        //     System.out.println("Enter a Valid number from 1 - 7 :");



        //Ex-2-------------------------------------------------------------------------

        // String day = "wed";
        // String result ="";

        // switch (day) {
        //     case "Sunday" -> result ="6am";
        //     case "Monday" -> result ="5am";
        //     default -> result = "4:30am";
                
        // }
        
        // System.out.println(result);



//Ex-3-------------------------------------------------------------------
        // String day = "wed";
        // String result ="";

        // result=switch (day) {
        //     case "Sunday" -> "6am";
        //     case "Monday" -> "5am";
        //     default -> "4:30am";
                
        // };
        
        // System.out.println(result);

//Ex-4---------------------------------------------------------------------- 
        String day = "wed";
        String result ="";

        result=switch (day) {
            case "Sunday" :yield "6am";
            case "Monday" :yield"5am";
            default :yield "4:30am";
                
        };
        
        System.out.println(result);       


    }

}