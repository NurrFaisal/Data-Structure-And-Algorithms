package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
//        CharFinder charFinder = new CharFinder();
//        var value = charFinder.findFirstNonRepeatingChar("a green apple");
//        System.out.println(value);

        var firstRepeatedChar = new FirstRepeatedChar();
        var result = firstRepeatedChar.firstRepeatedChar("green");
        System.out.println(result);
    }
}
