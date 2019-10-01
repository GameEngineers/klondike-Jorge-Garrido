package klondike.views.console.menu;

import com.sun.xml.internal.bind.marshaller.MinimumEscapeHandler;
import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromPileToFoundationCommand extends Command {

    public MoveFromPileToFoundationCommand(MoveController moveController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int pileIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.ORIGIN), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        Suit suit = Suit.find(IO.readChar(Message.READ_SUIT, Suit.initials()));
        return this.moveController.moveFromPileToFoundation(pileIndex, suit);
    }
}
