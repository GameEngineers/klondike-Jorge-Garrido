package klondike.controllers;

import klondike.models.Game;
import java.util.ArrayList;

public class MoveControllerBuilder {

    private ArrayList<MoveController> moveControllers;

    private Game game;

    public MoveControllerBuilder(Game game) {
        this.game = game;
        moveControllers = new ArrayList<>();
    }

    public void build() {
        moveControllers.add(new MoveFromFoundationToPileController(game));
        moveControllers.add(new MoveFromPileToFoundationController(game));
        moveControllers.add(new MoveFromPileToPileController(game));
        moveControllers.add(new MoveFromStockToWasteController(game));
        moveControllers.add(new MoveFromWasteToFoundationController(game));
        moveControllers.add(new MoveFromWasteToPileController(game));
        moveControllers.add(new MoveFromWasteToStockController(game));
    }

    public MoveController getMoveControllers(int option) {
        assert option >= 0;
        assert option < this.moveControllers.size();
        return this.moveControllers.get(option);
    }

    public int getOperations() {
        return moveControllers.size();
    }
}
