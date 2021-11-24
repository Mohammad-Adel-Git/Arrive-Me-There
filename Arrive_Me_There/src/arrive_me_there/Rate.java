package arrive_me_there;

public class Rate {

    private Client client;
    private RateValue rateValue;

    public Rate(Client client, RateValue rateValue) {
        this.client = client;
        this.rateValue = rateValue;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setRate(RateValue paramRateValue) {
        rateValue = paramRateValue;
    }

    public RateValue getRateValue() {
        return rateValue;
    }
}
