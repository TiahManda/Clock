import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel {
    private Clock clock;
    public void paintComponent(Graphics graphic) {
        change_color(graphic,0,0,0);
        graphic.drawRect(0,0,50,100);

        clock = new Clock();
        clock.creat_clock(this, graphic);
    }


    // change the color of the all component
    public void change_color(Graphics graphic, int red, int green, int bleu) {
        graphic.setColor(new Color(red, green, bleu));
    }

    // constructor
    public Panel() {

    }
}