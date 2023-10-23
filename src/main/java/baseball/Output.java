package baseball;

public class Output {
    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String END_MESSAGE = "3스트라이크\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
