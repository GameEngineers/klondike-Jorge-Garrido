package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;

public class MoveFromWasteToPileController extends MoveController {

    MoveFromWasteToPileController(Game game){
        super(game);
    }

    public Error moveFromWasteToPile(int pileIndex) {
        return this.game.moveFromWasteToPile(pileIndex);
    }

    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }
}
