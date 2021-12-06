package arrive_me_there;

public enum RateValue {
    Best(5), VeryGood(4), Good(3), Bad(2), Worst(1);
    private int value;

    private RateValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
