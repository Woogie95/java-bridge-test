import java.util.List;
import java.util.Map;

public class Bridges {

    private final Map<String, List<String>> bridges;

    public Bridges(Map<String, List<String>> bridges) {
        this.bridges = bridges;
    }

    public void checkBridgeState(BridgeLocation bridgeLocation) { // 이동할 위치 파라미터로 받기
        for (Map.Entry<String, List<String>> bridge : this.bridges.entrySet()) { // 맵 위, 아래
            for (String word : bridge.getValue()) { // 처음 위에 다리 밸류 값만 나옴
                if (bridgeLocation.getLocation().equals(word)){

                }
            }
        }
    }

    public void checkUpperBridge() {


    }



    public Map<String, List<String>> getBridges() {
        return bridges;
    }

}
