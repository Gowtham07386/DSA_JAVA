class college{
    String studentName ;
    int  rollnumber;
    String  results;
}
public class Array_objects {
    
    public static void main(String[] args) {
        college s1 = new college();
        s1.studentName="Ramu";
        s1.rollnumber = 23123;
        s1.results = "A+";

        college s2 = new college();
        s2.studentName="Ravenkat";
        s2.rollnumber = 23124;
        s2.results = "A";

        college s3 = new college();
        s3.studentName="harish";
        s3.rollnumber = 23125;
        s3.results = "O";  

        college s4 = new college();
        s4.studentName="ranga";
        s4.rollnumber = 23126;
        s4.results = "B+";      

        college college[]= new college[4];

        college[0]=s1;
        college[1]=s2;
        college[2]=s3;
        college[3]=s4;

        // System.out.println(s1.studentName+" : "+s1.rollnumber +" : "+s1.results);
        // System.out.println(s2.studentName+" : "+s2.rollnumber +" : "+s2.results);
        // System.out.println(s3.studentName+" : "+s3.rollnumber +" : "+s3.results);
        // System.out.println(s4.studentName+" : "+s4.rollnumber +" : "+s4.results);



        // for(int i =0 ; i< college.length;i++){
        //     System.out.println(college[i].studentName+" : "+college[i].rollnumber +" : "+college[i].results);
        // }


        for(college obj: college){
            System.out.println(obj.studentName+" : "+obj.rollnumber +" : "+obj.results);
        }

        
    }
}
