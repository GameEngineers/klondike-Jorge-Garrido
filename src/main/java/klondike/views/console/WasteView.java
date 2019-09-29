package klondike.views.console;

import klondike.controllers.Controller;

public class WasteView extends CardStackView {

    public WasteView(Controller controller) {
        super(controller, Message.WASTE_TITLE);
    }

    public void write() {
        super.write(this.controller.peekWaste());
    }
}
