/* ==========================================================================

TiahManda Clock App
Version 1.0

Author: TiahManda
Date: February 21, 2024
File: Window.java


Description:
This clock app displays - the current time in a user-friendly interface.
                        - the UTC time
                        - Time of the region you need
                        - Customised time

License: "MIT"

=============================================================================  */

import javax.swing.JFrame;
import java.awt.Color;

public class Window extends JFrame {
    public Panel panel;
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

        // To power on the clock
        this.panel.clock.animation(this);
    }

//change panel background
    public void change_background(Panel panel,int red, int green, int bleu) {
        panel.setBackground(new Color(red, green, bleu));
    }
}