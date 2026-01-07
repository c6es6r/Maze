
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 * Grafische Oberfläche und Main-Klasse
 */
public class Main extends JFrame{
    
    // Einstellung des Fensters
    public JFrame window;
    private String title = "Maze Generation and shortest Path";
    private PaintingArea paintingArea;

    public static final int WIDTH = 1601;
    public static final int HEIGHT = 801;

    public Graphics g;

    private Random r = new Random();
    
    int x = 10;

    /**
     * Konstruktor. Erstellt ein Fenster.
     */
    public Main() {
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLayout(new FlowLayout());

        paintingArea = new PaintingArea(this);
        paintingArea.setDoubleBuffered(true);
        paintingArea.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        window.getContentPane().add(paintingArea);

        window.pack();
        window.setVisible(true);

        g = paintingArea.getGraphics();
    }

    
    /**
     * Zeichenbereich
     */
    @Override
    public void paint(Graphics g) {
        // Zeichenbereich löschen 
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        x++;
        // Beispiellinie Zeichnen
        g.setColor(Color.BLACK);
        g.drawLine(0,0,x,100);
    }

    /**
     * main Methode. Startet das Fenster und zeichnet ruft wiederholt die
     * Methode paint auf. Nach jedem Schritt werden 20ms Pause gemacht.
     */
    public static void main(String[] args) {
        Main m = new Main();
        while (true) {
            m.paintingArea.repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
