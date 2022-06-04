package HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedChar {

    public char firstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        var chars = str.toCharArray();
        for (char ch : chars){
            if(set.contains(ch)) return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
