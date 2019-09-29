package klondike.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Stock extends Stack<Card> {

    public Stock() {
        super();
        for (Suit suit : Suit.values()) {
            for (Number number : Number.values()) {
                this.add(new Card(suit, number));
            }
        }
        Collections.shuffle(this);
    }

    public List<Card> takeTop(int quantity) {
        assert 0 < quantity && quantity <= this.size();
        List<Card> cardsToReturn = new ArrayList<>(this.subList(0, quantity));
        this.removeAll(cardsToReturn);
        return cardsToReturn;
    }

}
