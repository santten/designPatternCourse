package W8.command;

public class MoveCursorDownCommand implements Command {
    @Override
    public void execute() {
        PixelGrid grid = PixelGrid.getInstance();
        grid.setCursorY(grid.getCursorY() + 1);
    }
}
