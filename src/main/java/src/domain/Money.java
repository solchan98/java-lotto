package src.domain;

public class Money {

    private final int value;

    public Money(int value) {
        this.value = value;
    }

    public int lottoCount(int lottoPrice) {
        return value / lottoPrice;
    }
}
