import javax.swing.*;
import java.awt.*;

public class Scoreboard extends JPanel {

    private int score;
    private JLabel label;

    public Scoreboard() {
        super();
        score = 0;
        initGUI();
    }

    public void initGUI() {
        setLayout(new FlowLayout());
        label = new JLabel();
        add(label);
        increment(0);
    }

    public void increment(int inc) {
        score += inc;
        label.setText("" + score);
    }


}
