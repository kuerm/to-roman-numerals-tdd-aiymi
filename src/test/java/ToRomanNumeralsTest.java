import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
    private static final String ROMAN_NUMBER_TO_1 = "I";
    private String ROMAN_NUMBER_TO_4 = "IV";

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
        if (input == 4) {
            return ROMAN_NUMBER_TO_4;
        }
        if (input == 3) {
            return toRoman(1) + toRoman(1) + toRoman(1);
        }
        if (input == 2) {
            return toRoman(1) + toRoman(1);
        }
        if (input == 1) {
            return ROMAN_NUMBER_TO_1;
        }
        return null;
    }
}