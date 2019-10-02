package klondike.controllers;

import klondike.models.Game;
import klondike.models.State;

public class StartController extends Controller {

    public StartController(Game game) {
        super(game);
    }

    public void start() {
        this.state.next();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
