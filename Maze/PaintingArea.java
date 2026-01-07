import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintingArea extends JPanel {
    Main m;
    
    public PaintingArea(Main m){
        this.m = m;
    }
    
    @Override
    public void paintComponent(Graphics g){
        m.paint(g);
    }
}
