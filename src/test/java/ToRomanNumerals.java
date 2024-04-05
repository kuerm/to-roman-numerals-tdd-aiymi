import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumerals {
    @Test
    void one() {
        String expected = "I";
        int input = 1;

        String actual = toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }

    private String toRoman(int input) {
        if (input == 1) {
            return "I";
        }
        return null;
    }
}