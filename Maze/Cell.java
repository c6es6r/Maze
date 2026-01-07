
import java.awt.Graphics;

public class Cell {

    public int row;
    public int col;

    public boolean visited = false;

    public boolean northWall = true;
    public boolean southWall = true;
    public boolean westWall = true;
    public boolean eastWall = true;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void draw(Graphics g) {
        if (northWall) {
            g.drawLine(row * 25, col * 25, (row + 1) * 25, col * 25);
        }
        if (southWall) {
            g.drawLine((row + 1) * 25, (col + 1) * 25, row * 25, (col + 1) * 25);
        }
        if (westWall) {
            g.drawLine(row * 25, (col + 1) * 25, row * 25, col * 25);
        }
        if (eastWall) {
            g.drawLine((row + 1) * 25, col * 25, (row + 1) * 25, (col + 1) * 25);
        }

    }
}
