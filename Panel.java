"""
TiahManda Clock App
Version 1.0

Author: TiahManda
Date: February 21, 2024
File: Panel.java


Description:
This clock app displays - the current time in a user-friendly interface.
                        - the UTC time
                        - Time of the region you need
                        - Customised time

License: "MIT"
"""

import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel {
    public Clock clock = new Clock();
    public void paintComponent(Graphics graphic) {

        //background off the panel
        change_color(graphic,71,47,9);
        graphic.fillRect(0,0,this.getWidth(), this.getHeight());

        // setting clock
        this.clock.set_actual_time();

        // clock creation
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