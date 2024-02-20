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

    }
}