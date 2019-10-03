package klondike.controllers;

import klondike.models.Game;

public class StartController extends Controller {

    public StartController(Game game) {
        super(game);
    }

    public void start() {
        this.state.next();
    }

    @Override
    public void accept(MoveControllerVisitor moveControllerVisitor) {
        moveControllerVisitor.visit(this);
    }
}
