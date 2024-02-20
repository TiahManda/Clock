import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel {
    public void paintComponent(Graphics graphic) {
        change_color(graphic,0,0,0);
        graphic.drawRect(0,0,50,100);
    }


    // change the color of the all component
    public void change_color(Graphics graphic, int red, int green, int bleu) {
        graphic.setColor(new Color(red, green, bleu));
    }

    // constructor
    public Panel() {

    }
}