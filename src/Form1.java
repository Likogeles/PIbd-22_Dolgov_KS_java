import javax.swing.*;

public class Form1  extends JFrame{

    private JPanel mainPanel;

    public Form1(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        // new line
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new Form1("title");
        frame.setVisible(true);
    }
}
