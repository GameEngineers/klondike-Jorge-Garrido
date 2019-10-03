package klondike.views.console;

import klondike.controllers.*;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;
import klondike.views.console.menu.CommandBuilder;
import klondike.views.console.menu.OptionCommand;

import java.util.ArrayList;

public class MenuView implements MoveControllerVisitor {

    private static final String OPTION = "Choose an option: ";
    private ArrayList<OptionCommand> commands;

    public MenuView(CommandBuilder builder) {
        assert builder != null;
        this.commands = builder.getCommands();
    }

    public void execute() {
        boolean error;
        int option;
        do {
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                IO.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            IO.write(OPTION);
            option = IO.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            IO.writeln();
        } while (error);
        commands.get(option).execute();
    }

    @Override
    public void visit(MoveFromFoundationToPileController moveFromFoundationToPileController) {

    }

    @Override
    public void visit(MoveFromPileToFoundationController moveFromPileToFoundationController) {

    }

    @Override
    public void visit(MoveFromPileToPileController moveFromPileToPileController) {

    }

    @Override
    public void visit(MoveFromStockToWasteController moveFromStockToWasteController) {

    }

    @Override
    public void visit(MoveFromWasteToFoundationController moveFromWasteToFoundationController) {

    }

    @Override
    public void visit(MoveFromWasteToPileController moveFromWasteToPileController) {

    }

    @Override
    public void visit(MoveFromWasteToStockController moveFromWasteToStockController) {

    }
}
