import javax.swing.*;
import java.awt.*;

public class PaintJComponent extends JComponent {

    Ship ship;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (ship != null) ship.DrawTransport(g);

        super.repaint();
    }

    public void setTransport(Ship ship){
        this.ship = ship;
    }
    public Ship getTransport(){
        return ship;
    }
}
