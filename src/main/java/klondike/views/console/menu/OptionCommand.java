package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public abstract class OptionCommand extends Command {

    protected MoveController moveController;

    protected OptionCommand(String title, MoveController moveController) {
        super(title);
        this.moveController = moveController;
    }

    @Override
    public void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected int readFromPile(String message){
        return IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, message), new ClosedInterval(1, moveController.getNumberOfPiles())) - 1;
    }

    protected Suit readSuit(){
        return Suit.find(IO.readChar(Message.READ_SUIT, Suit.initials()));
    }

    protected abstract Error move();
}
