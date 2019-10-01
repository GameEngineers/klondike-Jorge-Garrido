package klondike.views.console.menu;

public abstract class Command {

    protected String title;

    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute();

    public String getTitle() {
        return this.title;
    }

}
