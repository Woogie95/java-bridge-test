import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    public static final Random RANDOM_NUMBER_ZERO_OR_ONE = new Random();

    public static List<Integer> generateRandomNumber(BridgeLength bridgeLength) { // 0 or 1 랜덤 숫자 생성
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < bridgeLength.getBridgeLength(); i++) {
            randomNumbers.add(RANDOM_NUMBER_ZERO_OR_ONE.nextInt(2));
        }
        return randomNumbers;
    }

}
