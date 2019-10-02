package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.controllers.MoveFromWasteToPileController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromWasteToPileCommand extends OptionCommand {

    private MoveFromWasteToPileController moveFromWasteToPileController;

    public MoveFromWasteToPileCommand(MoveFromWasteToPileController moveController) {
        super(CommandTitle.WASTE2PILE_COMMAND.getTitle());
        this.moveFromWasteToPileController = moveController;
    }

    @Override
    protected Error move() {
        int pileIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.DESTINATION), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        return this.moveFromWasteToPileController.moveFromWasteToPile(pileIndex);
    }
}
