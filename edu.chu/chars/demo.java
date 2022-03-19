package chars;

import java.util.HashMap;
import java.util.Map;

    public class demo {

        public static void main(String[] args) {

            String str = "!adhanlf@%nlesngal&*gnksvks esfkefbmflbskgbskbsf@lnefnwel";

            char[] chars = str.toCharArray();

            Map<Character, Integer> map = new HashMap<>();

            for(char c : chars){
                if(map.containsKey(c))map.put(c,map.get(c)+1);
                else map.put(c,1);
            }

            for(Map.Entry<Character,Integer> e: map.entrySet())
                System.out.println(e.getKey()+" "+e.getValue());

        }
    }
