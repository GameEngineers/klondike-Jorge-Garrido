package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.controllers.MoveFromWasteToStockController;
import klondike.models.Error;

public class MoveFromWasteToStockCommand extends OptionCommand {

    private MoveFromWasteToStockController moveFromWasteToStockController;

    public MoveFromWasteToStockCommand(MoveFromWasteToStockController moveController) {
        super(CommandTitle.WASTE2STOCK_COMMAND.getTitle());
        this.moveFromWasteToStockController = moveController;
    }

    @Override
    protected Error move() {
        return this.moveFromWasteToStockController.moveFromWasteToStock();
    }
}
