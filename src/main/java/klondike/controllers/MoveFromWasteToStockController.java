package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.State;

public class MoveFromWasteToStockController extends MoveController {

    MoveFromWasteToStockController(Game game){
        super(game);
    }

    public Error moveFromWasteToStock() {
        return this.game.moveFromWasteToStock();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
