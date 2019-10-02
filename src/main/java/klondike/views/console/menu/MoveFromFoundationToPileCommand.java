package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromFoundationToPileCommand extends OptionCommand {

    public MoveFromFoundationToPileCommand(MoveController moveController) {
        super(CommandTitle.FOUNDATION2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = this.readSuit();
        int pileIndex = this.readFromPile(Message.DESTINATION);
        return this.moveController.moveFromFoundationToPile(suit, pileIndex);
    }
}
