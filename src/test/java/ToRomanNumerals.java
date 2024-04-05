import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumerals {
    @Test
    void one() {
        String expected = "I";

        String actual = "";
        int input = 1;
        if (input == 1) {
            actual = "I";
        }

        assertThat(actual).isEqualTo(expected);
    }
}