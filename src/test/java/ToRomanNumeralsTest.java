import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
    private static final String ROMAN_NUMBER_TO_1 = "I";
    private static final String ROMAN_NUMBER_TO_4 = "IV";
    private static final Map<Integer, String> map = new HashMap<>() {{
        put(1, "I");
        put(4, "IV");
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

    private String toRoman(int input) {
        if (input >= 4) {
            return map.get(input) + toRoman(input - 4);
        }
        if (input == 3) {
            return toRoman(1) + toRoman(1) + toRoman(1);
        }
        if (input == 2) {
            return toRoman(1) + toRoman(1);
        }
        if (input == 1) {
            return map.get(input);
        }
        return "";
    }
}