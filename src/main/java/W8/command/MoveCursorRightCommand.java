package W8.command;

public class MoveCursorRightCommand implements Command {
    @Override
    public void execute() {
        PixelGrid grid = PixelGrid.getInstance();
        grid.setCursorX(grid.getCursorX() + 1);
    }
}
