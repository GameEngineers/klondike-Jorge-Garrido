package klondike.models;

public enum Number {
    AS,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public static final int NUMBER_OF_CARDS = 13;

    public int getValue() {
        return this.ordinal() + 1;
    }
}
