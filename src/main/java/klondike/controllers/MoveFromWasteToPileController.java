package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.State;

public class MoveFromWasteToPileController extends MoveController {

    MoveFromWasteToPileController(Game game){
        super(game);
    }

    public Error moveFromWasteToPile(int pileIndex) {
        return this.game.moveFromWasteToPile(pileIndex);
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
