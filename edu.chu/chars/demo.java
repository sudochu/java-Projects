package chars;

import java.util.Map;
import java.util.TreeMap;

public class demo {

    public static void main(String[] args) {

        String str = "!adhanlf@%nleKBSgal&*gnksvks esKDhGKfbm*flbskgbskbsf@lnefnwel";//disordered string

        char[] chars = str.toCharArray();

        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c : chars){
            if(map.containsKey(c))map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        for(Map.Entry<Character,Integer> e: map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());

    }
}
