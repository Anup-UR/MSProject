/*Occurance of characters*/
import java.util.HashMap;

public class Interview {
    public static void main(String[] args) {
     String name="Testing Character Countaaaa";
     name=name.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=name.length()-1;i>=0;i--) {
            if (name.charAt(i)!=' ') {
                if (map.containsKey(name.charAt(i))) {
                    int count = map.get(name.charAt(i));
                    map.put(name.charAt(i), ++count);
                } else
                    map.put(name.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
