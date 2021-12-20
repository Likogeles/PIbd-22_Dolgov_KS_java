import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BoatForm extends JFrame{

    private JFrame mainframe;

    private JPanel mainPanel;
    private JPanel paintPanel;
    private JButton buttonCreate;
    private JButton buttonLeft;
    private JButton buttonDown;
    private JButton buttonRight;
    private JButton buttonUp;

    private PaintJComponent paintJPanel;

    public BoatForm(String title){

        mainframe = new JFrame(title);
        mainframe.setPreferredSize(new Dimension(900, 500));
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        paintJPanel = new PaintJComponent();
        paintPanel.add(paintJPanel);
        mainframe.add(mainPanel);

        mainframe.pack();
        mainframe.setVisible(true);

        buttonCreate.addActionListener(e -> setShip());

        buttonUp.addActionListener(e ->{
            paintJPanel.getTransport().MoveTransport(Direction.Up);
            paintJPanel.repaint();
        });
        buttonDown.addActionListener(e ->{
            paintJPanel.getTransport().MoveTransport(Direction.Down);
            paintJPanel.repaint();
        });
        buttonRight.addActionListener(e ->{
            paintJPanel.getTransport().MoveTransport(Direction.Right);
            paintJPanel.repaint();
        });
        buttonLeft.addActionListener(e ->{
            paintJPanel.getTransport().MoveTransport(Direction.Left);
            paintJPanel.repaint();
        });

    }
    private void setShip(){
        Random rnd = new Random();
        paintJPanel.setTransport(new Ship(rnd.nextInt(500)+100, rnd.nextInt(500)+1000, Color.BLACK, Color.GRAY, true, true, true, 3));
        paintJPanel.getTransport().SetPosition(rnd.nextInt(590) + 10, rnd.nextInt(150) + 20, paintPanel.getWidth(), paintPanel.getHeight());
        paintPanel.add(paintJPanel);
        mainframe.repaint();
        mainframe.setVisible(true);
    }
}
