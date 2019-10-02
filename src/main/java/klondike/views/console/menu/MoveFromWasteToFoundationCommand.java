package klondike.views.console.menu;

import klondike.controllers.MoveFromWasteToFoundationController;
import klondike.models.Error;
import klondike.models.Suit;
import klondike.utils.IO;

public class MoveFromWasteToFoundationCommand extends OptionCommand {

    private MoveFromWasteToFoundationController moveFromWasteToFoundationController;

    public MoveFromWasteToFoundationCommand(MoveFromWasteToFoundationController moveController) {
        super(CommandTitle.WASTE2FOUNDATION_COMMAND.getTitle());
        this.moveFromWasteToFoundationController = moveController;
    }

    @Override
    protected Error move() {
        Suit suit = Suit.find(IO.readChar(Message.READ_SUIT, Suit.initials()));
        return this.moveFromWasteToFoundationController.moveFromWasteToFoundation(suit);
    }
}
