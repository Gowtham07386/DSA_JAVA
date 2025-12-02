class Annot{
    public void showTheDataWhichBelongsToThisClass(){
            System.out.println("Show in Annot");
    }
}
class Annot1 extends Annot{
    @Override //this is one of annotation to show mistakes while writing the methods overridding
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Show in Annot1");

    }

}
public class Annotation {
    public static void main(String[] args) {
        Annot1 obj= new Annot1();
        obj.showTheDataWhichBelongsToThisClass();
        
    }
    
}
