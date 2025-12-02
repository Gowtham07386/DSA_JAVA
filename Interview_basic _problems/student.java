import java.util.Scanner;

public class student{
    int rollno;
    String name;
    int marks[];
    public student(int rollno, String name, int[] marks){

        this.rollno = rollno;
        this.name =name;
        this.marks = marks;

    }
    public double calculateAverage(){
        double sum = 0;
        for(int i=0;i<marks.length-1;i++){
            sum = sum+marks[i];
        }
        return sum/5;
    }

    public char claculateGrade(double avg){
        if(avg >= 90){
            return 'A';

        }else if(avg >= 75){
            return 'B';

        }else if(avg >= 60){
            return 'C';
        }else {
            return 'D';
        }

        
    }
    public void displaydetails(){
        double avg = calculateAverage();
        System.out.println("Rollno :"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Average :"+avg);
        System.out.println("Grade :"+claculateGrade(avg));
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rollno = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int marks[]= new int[5];
        for(int i =0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        student obj=new student(rollno, name, marks);
        obj.displaydetails();



        
    }
    
}
