import javax.swing.JFrame;

public class Window extends JFrame {

    public Window() {

        // window property
        this.setTitle("Clock");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(000,000);
        this.setResizable(true);
        this.setSize(400,500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Window window = new Window();
    }
}