package klondike.views;

import klondike.controllers.Controller;
import klondike.controllers.ControllerVisitor;

public interface View extends ControllerVisitor {

    void interact(Controller controller);

}