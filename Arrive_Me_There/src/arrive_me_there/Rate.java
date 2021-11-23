package arrive_me_there;

enum RateValue {
    Best(5), VeryGood(4), Good(3), Bad(2), Worst(1);
    private int value;

    private RateValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Rate {

    private Client client;
    private RateValue rateValue;

    public Rate(Client client, RateValue rateValue) {
        this.client = client;
        this.rateValue = rateValue;
    }

    public void setClient(Clinet client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setRate(Rate rate) {
        this.rateValue = rate;
    }

    public RateValue getRate() {
        return rateValue;
    }
}
