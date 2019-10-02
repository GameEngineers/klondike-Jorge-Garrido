package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromPileToFoundationCommand extends OptionCommand {

    public MoveFromPileToFoundationCommand(MoveController moveController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = this.readFromPile(Message.ORIGIN);
        Suit suit = this.readSuit();
        return this.moveController.moveFromPileToFoundation(pileIndex, suit);
    }
}
