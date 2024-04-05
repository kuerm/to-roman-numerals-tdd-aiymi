import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
    private static final Map<Integer, String> map = new HashMap<>() {{
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};


    @Test
    void two() {
        String expected = "II";
        int input = 2;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void one() {
        String expected = "I";
        int input = 1;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void three() {
        String expected = "III";
        int input = 3;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void four() {
        String expected = "IV";
        int input = 4;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void five() {
        String expected = "V";
        int input = 5;

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