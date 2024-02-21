import javax.swing.JFrame;
import java.awt.Color;

public class Window extends JFrame {
    private Panel panel;
    private Menu menu;
    public Window() {
        // window property
        this.setTitle("Clock");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(000,000);
        this.setResizable(true);
        this.setSize(400,500);
        // initialisation panel
        this.panel = new Panel();

        this.setContentPane(this.panel);

        this.menu = new Menu();
        menu.createMenu(this);

        // window display
        this.setVisible(true);

        // change the main clock background
        this.panel.setBackground(new Color(0,0,0));



        // To power on the clock
        this.panel.clock.animation(this);
    }

//change panel background
    public void change_background(Panel panel,int red, int green, int bleu) {
        panel.setBackground(new Color(red, green, bleu));
    }
}