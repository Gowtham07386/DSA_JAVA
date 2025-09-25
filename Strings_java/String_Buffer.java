public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Gowtham");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Koppera");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(0,"K.");
        System.out.println(sb);
    }
    
}
