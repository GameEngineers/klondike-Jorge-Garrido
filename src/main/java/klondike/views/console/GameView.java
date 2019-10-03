package klondike.views.console;

import klondike.controllers.Controller;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.IO;

public class GameView {


    private final Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
    }

    public void write() {
        IO.writeln();
        IO.writeln(Message.GAME_TITLE);
        new StockView(this.controller).write();
        new WasteView(this.controller).write();
        IO.writeln(Message.FOUNDATIONS_TITLE);
        for (Suit suit : Suit.values()) {
            new FoundationView(this.controller, suit).write();
        }
        IO.writeln(Message.PILES_TITLE);
        for (int i = 0; i < controller.getNumberOfPiles(); i++) {
            new PileView(this.controller, i).write();
        }
        IO.writeln(Message.GAME_END);
        IO.writeln();
    }
}
