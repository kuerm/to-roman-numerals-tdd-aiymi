package ch.css.m3000;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ToRomanNumeralsTest {

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
        String actual = Converter.toRoman(input);

        assertThat(actual).isEqualTo(expected);
    }
}