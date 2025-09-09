class example{
    int num =8;
    public int add(int n1,int n2){
        return n1+n2;
    }

}
public class stack_Heap {
    public static void main(String[] args) {
        example obj = new example();
        example obj1 = new example();

        int r = obj.add(9,4);
        
        System.out.println(r);

        obj.num = 25;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
    
}
