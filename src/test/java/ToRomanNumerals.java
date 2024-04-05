import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumerals {
    @Test
    void one() {
        String expected = "I";

        String actual = "";
        int input = 1;
        actual = toRoman(input, actual);

        assertThat(actual).isEqualTo(expected);
    }

    private String toRoman(int input, String actual) {
        if (input == 1) {
            return "I";
        }
        return null;
    }
}