public class BridgeLength {

    public long bridgeLength;

    public BridgeLength(String bridgeLength) {
        this.bridgeLength = modifyBridgeLengthType(bridgeLength);
    }

//    public long validate(String inputBridgeLength) { // 나중에 검증
//        return modifyBridgeLengthType(inputBridgeLength);
//    }

    public long modifyBridgeLengthType(String inputBridgeLength) { // 다리 길이 타입변경 검증 전
        return Long.parseLong(inputBridgeLength);
    }

    public long getBridgeLength() {
        return bridgeLength;
    }

}
