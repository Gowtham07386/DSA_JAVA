public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0,'G');
        System.out.println(sb);

        //Insert char at index n
        sb.insert(2,'n');
        System.out.println(sb);

        //Delete character at any index
        sb.delete(2,3);
        System.out.println(sb);

    }
    
}
