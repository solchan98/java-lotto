package src.domain;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class LottoGameNumberGeneratorTest {

    @Test
    void 로또의_번호는_6개로_구성되어있다() {
        // given
        int lottoNumberCount = 6;
        LottoGameNumberGenerator gameNumberGenerator = new LottoGameNumberGenerator();

        // when
        Set<GameNumber> gameNumbers = gameNumberGenerator.gameNumbers();

        // then
        assertThat(gameNumbers).hasSize(lottoNumberCount);
    }
}
