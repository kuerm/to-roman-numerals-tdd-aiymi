import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
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
        int four = 4;
        int one = 1;
        if (input >= four) {
            return map.get(input) + toRoman(input - four);
        }
        if (input >= one) {
            return map.get(one) + toRoman(input - one);
        }
        return "";
    }
}