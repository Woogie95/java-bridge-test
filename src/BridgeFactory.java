import java.util.*;

public class BridgeFactory {

    public static Bridges generateBridges(List<String> upperBridge, List<String> lowerBridge) {
        Map<String, List<String>> bridges = new LinkedHashMap<>();
        bridges.put("upper", upperBridge);
        bridges.put("lower", lowerBridge);
        return new Bridges(bridges);
    }

    public static List<String> generateUpperBridge(List<Integer> randomNumbers) { // 위에 다리 저장
        List<String> upperBridge = new ArrayList<>();
        for (int randomNumber : randomNumbers) {
            if (randomNumber == 1) {
                upperBridge.add(" O ");
            }
            if (randomNumber == 0) {
                upperBridge.add(" X ");
            }
        }
        return upperBridge;
    }

    public static List<String> generateLowerBridge(List<String> upperBridge) {
        List<String> lowerBridge = new ArrayList<>();
        for (String word : upperBridge) {
            if (word.equals(" O ")) {
                lowerBridge.add(" X ");
            }
            if (word.equals(" X ")) {
                lowerBridge.add(" O ");
            }
        }
        return lowerBridge;
    }

}
