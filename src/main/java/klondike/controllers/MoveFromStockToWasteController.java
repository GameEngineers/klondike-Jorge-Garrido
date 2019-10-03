package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;

public class MoveFromStockToWasteController extends MoveController {

    MoveFromStockToWasteController(Game game){
        super(game);
    }

    public Error moveFromStockToWaste() {
        return this.game.moveFromStockToWaste();
    }

    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }

}
