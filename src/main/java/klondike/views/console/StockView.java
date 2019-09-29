package klondike.views.console;

import klondike.controllers.Controller;

public class StockView extends CardStackView {

    public StockView(Controller controller) {
        super(controller, Message.STOCK_TITLE);
    }

    public void write() {
        super.write(this.controller.peekStock());
    }
}
