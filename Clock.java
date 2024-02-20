import javax.swing.*;

//importation of color and graphics
import java.awt.*;

public class Clock {

    private int reference;

// Constructor
    public Clock() {
        
    } 
    
// getter and setter
    public int getReference() {
        return reference;
    } public void setReference(int reference) {
        this.reference = reference;
    }

// creation of the main clock
    public void creat_clock(Panel panel, Graphics graphic) {

    // To adjust the size of the clock according the size of the window
        if(panel.getWidth() < panel.getHeight()) {
            this.setReference(panel.getWidth());
        } else {
            this.setReference(panel.getHeight());
        }

    // creation of the clock's body

        // first layout
        panel.change_color(graphic, 95 , 95, 95);
        // x = 5%, y = 5%, width = 90%, height = 90%;
        graphic.fillOval(this.getReference() * 5 / 100, this.getReference() * 5 / 100, this.getReference() * 9 / 10, this.getReference() * 9 / 10 );


        // border of the first layout
        panel.change_color(graphic, 0, 0, 0);
        // x = 5%, y = 5%, width = 90%, height = 90%;
        graphic.drawOval(this.getReference() * 5 / 100, this.getReference() * 5 / 100, this.getReference() * 9 / 10, this.getReference() * 9 / 10 );

        
        // second layout
        panel.change_color(graphic, 0 , 0, 0);
        // x = 8%, y = 8%, width = 84%, height = 84%;
        graphic.fillOval(this.getReference() * 8 / 100, this.getReference() * 8 / 100, this.getReference() * 84 / 100, this.getReference() * 84 / 100 );

        // middle of the clock
        panel.change_color(graphic, 95 , 95, 95);
        // x = 48%, y = 48%, width = 4%, height = 4%;
        graphic.fillOval(this.getReference() * 48 / 100, this.getReference() * 48 / 100, this.getReference() * 4 / 100, this.getReference() * 4 / 100 );


// creation of the marking
        int x;
        int y;
        for(int i = 0; i < 60; ++i) {
            x = (int) ((Math.cos(Math.PI*i/30)) * 10000);
            y = (int) ((Math.sin(Math.PI*i/30)) * 10000);

            // creation mark in 0, 3, 6, 9;
            if(i%15 == 0) {
                panel.change_color(graphic, 255, 255, 255);
                this.big_mark(graphic, 4, x, y);
            } 

            // creation mark in 1, 2, 4, 5, 7, 8, 10, 11;
            else if((i%5 == 0) && (i%15!=0)) {
                panel.change_color(graphic, 255, 255, 255);
                this.little_mark(graphic, 3, x, y);
            }

            // creation of the remaining mark
            else {
                panel.change_color(graphic, 127, 127, 230);
                this.little_mark(graphic, 2, x, y);
            }
        }
    }

    public void big_mark(Graphics g, int k, int x, int y) {
            g.fillRect((getReference()*50/100 + getReference()*42/100*x/10000 -getReference()*k/2/100 ), (getReference()*50/100 - getReference()*42/100*y/10000 -getReference()*k/2/100), getReference()*k/100, getReference()*k/100);
    }

    public void little_mark(Graphics g, int k, int x, int y) {
            g.fillOval((getReference()*50/100 + getReference()*42/100*x/10000 -getReference()*k/2/100 ), (getReference()*50/100 - getReference()*42/100*y/10000 -getReference()*k/2/100), getReference()*k/100, getReference()*k/100);
    }
}