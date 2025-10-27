enum Status{ //Status is a class 
    Running, Pending, Success, Failed; // objects
}

public class Enum {
    public static void main(String[] args) {
        // int i = 26;
        Status s = Status.Running;

        Status[] d= Status.values(); // Status.values give you array


        System.out.println(s); // To print the name of the object in the status
        System.out.println(s.ordinal()); // to print number of object in series
        for(Status D : d){
        System.out.println(D +" : "+ D.ordinal());
        }

    }
    
}
