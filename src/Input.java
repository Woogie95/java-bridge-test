import java.util.Scanner;

public class Input {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String inputBridgeLength() {
        System.out.println("다리의 길이를 입력해주세요.");
        return SCANNER.nextLine();
    }

    public static String inputMovableSpaceSelect() {
        System.out.println("\n" + "이동할 칸을 선택해주세요. (위: U, 아래: D)");
        return SCANNER.nextLine();
    }

    public static String inputRetryGame() {
        System.out.println("\n" + "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        return SCANNER.nextLine();
    }

}
