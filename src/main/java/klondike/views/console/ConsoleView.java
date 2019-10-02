package klondike.views.console;

import klondike.controllers.*;
import klondike.utils.YesNoDialog;
import klondike.views.View;
import klondike.views.console.menu.MenuCommandBuilder;

public class ConsoleView implements View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
        new GameView(startController).write();
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(Message.RESUME));
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
