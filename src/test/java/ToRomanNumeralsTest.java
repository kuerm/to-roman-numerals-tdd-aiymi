import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {
    private static final String ROMAN_NUMBER_TO_1 = "I";

    @Test
    void one() {
        String expected = "I";
        int input = 1;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    private String toRoman(int input) {

        if (input == 1) {
            return ROMAN_NUMBER_TO_1;
        }
        return null;
    }
}