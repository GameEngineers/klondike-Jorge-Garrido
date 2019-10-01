package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromFoundationToPileCommand extends Command {

    public MoveFromFoundationToPileCommand(MoveController moveController) {
        super(CommandTitle.FOUNDATION2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = Suit.find(IO.readChar(Message.READ_SUIT, Suit.initials()));
        int pileIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.DESTINATION), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        return this.moveController.moveFromFoundationToPile(suit, pileIndex);
    }
}
