package ch.css.m3000;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static final Map<Integer, String> map = new HashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String toRoman(int input) {
        for (int possibleKey = input; possibleKey > 0; possibleKey--) {
            if (map.containsKey(possibleKey)) {
                return map.get(possibleKey) + toRoman(input - possibleKey);
            }
        }
        return "";
    }
}
