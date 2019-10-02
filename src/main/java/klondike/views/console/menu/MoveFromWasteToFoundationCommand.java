package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Suit;
import klondike.utils.IO;

public class MoveFromWasteToFoundationCommand extends OptionCommand {

    public MoveFromWasteToFoundationCommand(MoveController moveController) {
        super(CommandTitle.WASTE2FOUNDATION_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        Suit suit = this.readSuit();
        return this.moveController.moveFromWasteToFoundation(suit);
    }
}
