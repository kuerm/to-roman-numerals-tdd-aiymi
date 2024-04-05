import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
    private static final Map<Integer, String> map = new HashMap<>() {{
        put(1000, "M");
        put(50, "L");
        put(10, "X");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "4, IV",
            "5, V",
            "10, X",
            "50, L",
            "3000, MMM"
    })
    void toRoman(int input, String expected) {
        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }


    private String toRoman(int input) {

        for (int possibleKey = input; possibleKey > 0; possibleKey--) {
            if (map.containsKey(possibleKey)) {
                return map.get(possibleKey) + toRoman(input - possibleKey);
            }
        }
        return "";
    }
}