package klondike.views.console.menu;

import klondike.controllers.MoveController;

import java.util.ArrayList;

public class MenuBuilder implements Builder {

    private ArrayList<OptionCommand> commands;

    public MenuBuilder(MoveController moveController) {
        commands = new ArrayList<>();
        commands.add(new MoveFromStockToWasteCommand(moveController));
        commands.add(new MoveFromWasteToStockCommand(moveController));
        commands.add(new MoveFromWasteToFoundationCommand(moveController));
        commands.add(new MoveFromWasteToPileCommand(moveController));
        commands.add(new MoveFromFoundationToPileCommand(moveController));
        commands.add(new MoveFromPileToFoundationCommand(moveController));
        commands.add(new MoveFromPileToPileCommand(moveController));
    }

    public ArrayList<OptionCommand> getCommands() {
        return commands;
    }
}
