import java.util.List;

public class BridgeManager {


    public void runBridgeCrossingGame() {
        Output.printGameStartMessage(); // 다리 건너기 게임을 시작합니다.

        BridgeLength bridgeLength = new BridgeLength(Input.inputBridgeLength());

        boolean is = true;
        while (is) {
            is = false;
            List<String> upper = BridgeFactory.generateUpperBridge(RandomNumber.generateRandomNumber(bridgeLength));

            Bridges bridges = BridgeFactory.generateBridges(upper, BridgeFactory.generateLowerBridge(upper));

            BridgeLocation bridgeLocation = new BridgeLocation(Input.inputMovableSpaceSelect()); // 이동할 칸 선택
        }
    }

}
