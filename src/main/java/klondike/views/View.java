package klondike.views;

import klondike.controllers.Controller;
import klondike.controllers.MoveControllerVisitor;

public interface View extends MoveControllerVisitor {

    void interact(Controller controller);

}