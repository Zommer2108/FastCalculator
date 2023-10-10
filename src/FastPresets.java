public class FastPresets {
    private int fastLength;
    private int eatLength;

    FastPresets(int fastLength, int eatLength){
        this.fastLength = fastLength;
        this.eatLength = eatLength;
    }

    public int getFastLengthInSecond(){
        return this.fastLength * 3600;
    }
}
