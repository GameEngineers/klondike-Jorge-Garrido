package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;

public class MoveFromWasteToFoundationController extends MoveController {

    MoveFromWasteToFoundationController(Game game) {
        super(game);
    }

    public Error moveFromWasteToFoundation(Suit suit) {
        Error error = this.game.moveFromWasteToFoundation(suit);
        if (error == null && this.game.isFinished()) {
            this.state.next();
        }
        return error;
    }

    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }
}
