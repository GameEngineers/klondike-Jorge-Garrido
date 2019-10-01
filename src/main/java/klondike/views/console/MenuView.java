package klondike.views.console;

import klondike.utils.ClosedInterval;
import klondike.utils.IO;
import klondike.views.console.menu.Builder;
import klondike.views.console.menu.OptionCommand;
import klondike.views.console.menu.MenuBuilder;

import java.util.ArrayList;

public class MenuView {

    private static final String OPTION = "Choose an option: ";
    private ArrayList<OptionCommand> commands;

    public MenuView(Builder builder) {
        assert builder != null;
        this.commands = builder.getCommands();
    }

    public void execute() {
        boolean error;
        int option;
        do {
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                IO.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            IO.write(OPTION);
            option = IO.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            IO.writeln();
        } while (error);
        commands.get(option).execute();
    }
}
