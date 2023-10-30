package racingcar.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ValidationTest {

    Validation validation = new Validation();

    @Test
    void validationName() {
        String carNames = "pobi,woni,jun";
        String startComma = ",pobi,woni,jun";
        String finishComma = "pobi,woni,jun,";
        String haveWhitespace = "pobi, woni, jun";
        String overFiveCharacters = "handsomepobi,woni,jun";
        String toUpperCase = "pobi,woni,Jun";

        assertThat(validation.validationNames(carNames)).isEqualTo(true);
        assertThat(validation.validationNames(startComma)).isEqualTo(false);
        assertThat(validation.validationNames(finishComma)).isEqualTo(false);
        assertThat(validation.validationNames(haveWhitespace)).isEqualTo(false);
        assertThat(validation.validationNames(overFiveCharacters)).isEqualTo(false);
        assertThat(validation.validationNames(toUpperCase)).isEqualTo(false);
    }

}