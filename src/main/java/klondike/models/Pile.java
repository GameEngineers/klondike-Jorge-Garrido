package klondike.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pile extends Stack<Card>{

    private int numberOfFaceUpCards;

    public Pile(List<Card> cards) {
        this.numberOfFaceUpCards = 0;
        this.addAll(cards);
        if (!this.empty()) {
            flipFirstCard();
        }
    }

    private void flipFirstCard() {
        assert !this.empty() && this.numberOfFaceUpCards == 0 && this.peek().isFacedUp();
        this.peek().flip();
        numberOfFaceUpCards++;
    }

    public boolean fitsIn(Card card) {
        assert card != null;
        return (this.empty() && card.getNumber() == Number.KING) ||
                (!this.empty() && this.peek().isNextTo(card) && this.peek().getColor() != card.getColor());
    }

    public List<Card> getTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        return new ArrayList<>(this.subList(this.size() - numberOfCards, this.size()));
    }

    public void addToTop(List<Card> cards) {
        assert cards != null;
        this.addAll(cards);
        numberOfFaceUpCards += cards.size();
    }

    public void removeTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        for (int i = 0; i < numberOfCards; i++) {
            this.pop();
            numberOfFaceUpCards--;
        }
        if (this.numberOfFaceUpCards == 0 && !this.empty()) {
            flipFirstCard();
        }
    }

    public int numberOfFaceUpCards() {
        return this.numberOfFaceUpCards;
    }

    public Stack<Card> getCards() {
        return this;
    }
}
