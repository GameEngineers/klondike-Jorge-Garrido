package klondike.views.console.menu;

import klondike.controllers.MoveFromStockToWasteController;
import klondike.models.Error;

public class MoveFromStockToWasteCommand extends OptionCommand {

    private MoveFromStockToWasteController moveFromStockToWasteController;

    public MoveFromStockToWasteCommand(MoveFromStockToWasteController moveController) {
        super(CommandTitle.STOCK2WASTE_COMMAND.getTitle());
        this.moveFromStockToWasteController = moveController;
    }

    @Override
    protected Error move() {
        return this.moveFromStockToWasteController.moveFromStockToWaste();
    }
}
