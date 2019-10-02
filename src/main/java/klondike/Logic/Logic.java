package klondike.Logic;

import klondike.controllers.Controller;
import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
import klondike.controllers.StartController;
import klondike.models.Game;
import klondike.models.State;
import klondike.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final State state;

    private Game game;

    private Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game));
        this.controllers.put(StateValue.IN_GAME, new MoveController(this.game));
        this.controllers.put(StateValue.FINAL, new ResumeController(this.game));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
