package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;

public class MoveFromPileToFoundationController extends MoveController {

    MoveFromPileToFoundationController(Game game){
        super(game);
    }

    public Error moveFromPileToFoundation(int pileIndex, Suit suit) {
        Error error = this.game.moveFromPileToFoundation(pileIndex, suit);
        if (error == null && this.game.isFinished()) {
            this.state.next();
        }
        return error;
    }

    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }
}
