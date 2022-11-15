public class ResultView {

    public static void printResult(int ball, int strike, boolean finished) {
        if (finished) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (ball > 0) {
            appendBallMessage(ball, stringBuilder);
        }
        if (strike > 0) {
            appendStrikeMessage(strike, stringBuilder);
        }

        if(stringBuilder.length() == 0) {
            System.out.println("nothing");
            return;
        }
        System.out.println(stringBuilder);
    }

    private static void appendBallMessage(int ball, StringBuilder stringBuilder) {
        stringBuilder.append(ball);
        stringBuilder.append("볼");
    }

    private static void appendStrikeMessage(int strike, StringBuilder stringBuilder) {
        if(stringBuilder.length() > 0) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(strike);
        stringBuilder.append("스트라이크");
    }
}
