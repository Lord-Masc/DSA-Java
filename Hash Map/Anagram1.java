
import java.util.HashMap;

public class Anagram1 {

    static boolean isAnagram(String s , String t){
         HashMap<Character,Integer> map = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
            
             map.put(ch, map.getOrDefault(ch, 0)+1);
             
         }
         for (int i = 0; i < t.length(); i++) {
             char ph = t.charAt(i);
             if(map.get(ph) != null){
                if (map.get(ph)==1) {
                    map.remove(ph);
                }else{
                    map.put(ph, map.get(ph)-1);
                }
             }else{
                return false;
             }
         }
         return map.isEmpty();
    }
   public static void main(String[] args) {
        String s = "soon";
        String t = "oosn";
        System.out.println(isAnagram(s, t));
   } 
}
