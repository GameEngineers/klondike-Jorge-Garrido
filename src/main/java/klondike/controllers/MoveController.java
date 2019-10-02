package klondike.controllers;

import klondike.models.Error;
import klondike.models.Game;
import klondike.models.State;
import klondike.models.Suit;

public abstract class MoveController extends Controller {

    public MoveController(Game game) {
        super(game);
    }

//    @Override
//    public void accept(ControllerVisitor controllerVisitor) {
//        controllerVisitor.visit(this);
//    }
}
