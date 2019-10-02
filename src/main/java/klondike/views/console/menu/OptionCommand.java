package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.utils.IO;

public abstract class OptionCommand extends Command {

    protected OptionCommand(String title) {
        super(title);
    }

    @Override
    public void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();
}
