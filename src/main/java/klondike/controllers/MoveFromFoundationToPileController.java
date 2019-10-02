package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;

public class MoveFromFoundationToPileController extends MoveController {

    public MoveFromFoundationToPileController(Game game){
        super(game);
    }

    public Error move(Suit suit, int pileIndex) {
        return this.game.moveFromFoundationToPile(suit, pileIndex);
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
