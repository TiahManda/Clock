import javax.swing.JFrame;

public class Window extends JFrame {
    private Panel panel;
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

        // window display
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Window window = new Window();
    }
}