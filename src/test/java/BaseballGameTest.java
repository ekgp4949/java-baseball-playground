import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    private BaseballGame baseballGame;


    @BeforeEach
    void setup() {
        baseballGame = new BaseballGame(new ScannerUtil(new Scanner(System.in)));
    }

    @Test
    void commence() {
    }

    @Test
    void play() {
    }

    @Test
    void convertInputToIntArray() {
        int[] ints = baseballGame.convertInputToIntArray(123);

        assertThat(ints).containsExactly(1,2,3);
    }
    

}