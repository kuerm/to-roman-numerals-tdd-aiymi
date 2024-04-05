import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
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

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "4, IV",
            "5, V",
            "6, VI",
            "9, IX",
            "10, X",
            "42, XLII",
            "50, L",
            "90, XC",
            "91, XCI",
            "95, XCV",
            "96, XCVI",
            "99, XCIX",
            "100, C",
            "400, CD",
            "500, D",
            "600, DC",
            "900, CM",
            "3000, MMM"
    })
    void toRoman(int input, String expected) {
        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }
}