package klondike.views.console.menu;

import klondike.controllers.MoveFromPileToFoundationController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromPileToFoundationCommand extends OptionCommand {

    private MoveFromPileToFoundationController moveFromPileToFoundationController;

    public MoveFromPileToFoundationCommand(MoveFromPileToFoundationController moveController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle());
        this.moveFromPileToFoundationController = moveController;
    }

    @Override
    protected Error move() {
        int pileIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.ORIGIN), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        Suit suit = Suit.find(IO.readChar(Message.READ_SUIT, Suit.initials()));
        return this.moveFromPileToFoundationController.moveFromPileToFoundation(pileIndex, suit);
    }
}
