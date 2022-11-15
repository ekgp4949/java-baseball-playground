import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {


    private Game game;

    @BeforeEach
    void setup() {
        game = new Game(new int[] {1,2,3});
    }


    @Test
    void finish() {
        game.checkAllStrikeAndBall(new int[] {1,2,3});
        game.finish();

        assertThat(game.isFinished()).isTrue();
    }

    @Test
    void checkAllStrikeAndBall() {
        game.checkAllStrikeAndBall(new int[] {3,1,2});

        assertThat(game.getBallCount()).isEqualTo(3);
        assertThat(game.getStrikeCount()).isEqualTo(0);
    }

    @Test
    void checkStrikeAndBall() {
        game.checkStrikeAndBall(0, 1);

        assertThat(game.getBallCount()).isEqualTo(0);
        assertThat(game.getStrikeCount()).isEqualTo(1);
    }

    @Test
    void isStrikeReturnTrue() {
        boolean strike = game.isStrike(3, 3);
        assertThat(strike).isTrue();
    }

    @Test
    void isStrikeReturnFalse() {
        boolean strike = game.isStrike(3, 2);
        assertThat(strike).isFalse();
    }


    @Test
    void isBallReturnTrue() {
        boolean ball = game.isBall(2);
        assertThat(ball).isTrue();
    }

    @Test
    void isBallReturnFalse() {
        boolean ball = game.isBall(5);
        assertThat(ball).isFalse();
    }
}