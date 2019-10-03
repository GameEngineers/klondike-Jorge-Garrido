package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;

public class MoveFromWasteToStockController extends MoveController {

    MoveFromWasteToStockController(Game game){
        super(game);
    }

    public Error moveFromWasteToStock() {
        return this.game.moveFromWasteToStock();
    }

    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }
}
