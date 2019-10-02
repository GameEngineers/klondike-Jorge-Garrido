package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.State;

public class MoveFromPileToPileController extends MoveController {

    MoveFromPileToPileController(Game game){
        super(game);
    }

    public Error moveFromPileToPile(int originIndex, int destinationIndex, int numberOfCards) {
        return this.game.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
