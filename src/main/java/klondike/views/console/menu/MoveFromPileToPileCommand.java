package klondike.views.console.menu;


import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Number;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromPileToPileCommand extends OptionCommand {

    public MoveFromPileToPileCommand(MoveController moveController) {
        super(CommandTitle.PILE2PILE_COMMAND.getTitle(), moveController);
    }

    @Override
    protected Error move() {
        int originIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.ORIGIN), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        int destinationIndex = IO.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, Message.DESTINATION), new ClosedInterval(1, Game.NUMBER_OF_PILES)) - 1;
        int numberOfCards = IO.readInt(Message.READ_NUMBER_OF_CARDS, new ClosedInterval(1, Number.NUMBER_OF_CARDS));
        return this.moveController.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
    }
}
