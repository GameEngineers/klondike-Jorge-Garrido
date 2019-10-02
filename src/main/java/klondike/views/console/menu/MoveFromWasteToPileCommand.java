package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromWasteToPileCommand extends OptionCommand {

    public MoveFromWasteToPileCommand(MoveController moveController) {
        super(CommandTitle.WASTE2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = this.readFromPile(Message.DESTINATION);
        return this.moveController.moveFromWasteToPile(pileIndex);
    }
}
