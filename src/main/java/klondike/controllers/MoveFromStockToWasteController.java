package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.State;

public class MoveFromStockToWasteController extends MoveController {

    MoveFromStockToWasteController(Game game){
        super(game);
    }

    public Error moveFromStockToWaste() {
        return this.game.moveFromStockToWaste();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
