public class while_loop {
    public static void main(String args[]){

        //repeat this statements n number of times
        //loop - while, do while , for

        int i = 1;

        while(i<5){
            System.out.println("Hi"+ i);

            int j=1;

            while(j<4){
                System.out.println("Hello");
                j++;
            }

            i++;
        }

        System.out.println("Byee"+i);


        
    }
    
}

//OUTPUT------------------------
// Hi1
// Hello
// Hello
// Hello
// Hi2
// Hello
// Hello
// Hello
// Hi3
// Hello
// Hello
// Hello
// Hi4
// Hello
// Hello
// Hello
// Byee5