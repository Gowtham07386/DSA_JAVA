import java.util.*;

public class frist_char_inString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s =sc.nextLine();

        HashMap<Character, Integer> mp =new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            mp.put(c ,mp.getOrDefault(c, 0)+1);
        }
        boolean found = false;
        for(Map.Entry<Character, Integer> m :mp.entrySet()){
            if(m.getValue() == 1){
                System.out.println("The first non repeating :"+m.getKey());
                found = true;
                return;

            }

        }
        
        if(found == false){
            System.out.println("There is non repeated characters in the string");
            System.out.println(-1);
        }
    }
}