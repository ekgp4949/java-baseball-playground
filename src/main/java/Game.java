import java.util.Arrays;

public class Game {
    private int ball;
    private int strike;
    private GameStatus status;
    private final int[] goal;

    public Game(int[] goal) {
        this.goal = goal;
        this.status = GameStatus.IN_PROGRESS;
    }

    public void start() {
        this.ball = 0;
        this.strike = 0;
    }
    public void finish() {
        if(this.strike == 3) {
            this.status = GameStatus.FINISHED;
        }
    }

    public boolean isFinished() {
        return this.status == GameStatus.FINISHED;
    }

    public void printTarget() {
        System.out.println("goal = " + goal[0]+goal[1]+goal[2]);
    }

    public void checkAllStrikeAndBall(int[] numbers) {
        for (int i = 0; i < 3; i++) {
            checkStrikeAndBall(i, numbers[i]);
        }
    }

    public void checkStrikeAndBall(int position, int number) {
        if(isStrike(goal[position], number)) {
            this.strike++;
            return;
        }
        if(isBall(number)) {
            this.ball++;
        }
    }

    public boolean isStrike(int target, int number) {
        return target == number;
    }

    public boolean isBall(int number) {
        return Arrays.stream(goal)
                       .anyMatch(target -> target == number);
    }

    public int getStrikeCount() {
        return this.strike;
    }

    public int getBallCount() {
        return this.ball;
    }
}
