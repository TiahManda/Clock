/* ==========================================================================

    TiahManda Clock App
    Version 1.0

    Author: TiahManda
    Date: February 21, 2024
    File: Clock.java


    Description:
    This clock app displays - the current time in a user-friendly interface.
                            - the UTC time
                            - Time of the region you need
                            - Customised time

    License: "MIT"

==============================================================================  */


import javax.swing.*;
import java.time.LocalTime;

//importation of color and graphics
import java.awt.*;

public class Clock {

    private int reference;
    private Pin hour = new Pin();
    private Pin minute = new Pin();
    private Pin second = new Pin();

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
            x = (int) ((Math.cos(Math.PI*(i+15)/30)) * 10000);
            y = (int) ((Math.sin(Math.PI*(i+15)/30)) * 10000);

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

    // creation pin
        //hour pins
        panel.change_color(graphic,255,255,255);
        hour.location_pin(hour.getLoc());
        hour.create_pin(graphic,21,this.getReference());

        // minute pin
        panel.change_color(graphic,147, 147, 255);
        minute.location_pin(minute.getLoc());
        minute.create_pin(graphic,35,this.getReference());

        // second pin
        panel.change_color(graphic,255,0,0);
        second.location_pin(second.getLoc());
        second.create_pin(graphic,40,this.getReference());
    }

    public void big_mark(Graphics g, int k, int x, int y) {
            g.fillRect((getReference()*50/100 + getReference()*42/100*x/10000 -getReference()*k/2/100 ), (getReference()*50/100 - getReference()*42/100*y/10000 -getReference()*k/2/100), getReference()*k/100, getReference()*k/100);
    }

    public void little_mark(Graphics g, int k, int x, int y) {
            g.fillOval((getReference()*50/100 + getReference()*42/100*x/10000 -getReference()*k/2/100 ), (getReference()*50/100 - getReference()*42/100*y/10000 -getReference()*k/2/100), getReference()*k/100, getReference()*k/100);
    }

// setting the clock to personnalised
    public void personnalise_time(int hr, int min, int sec) {
        this.hour.setLoc(hr);
        this.minute.setLoc(min);
        this.second.setLoc(sec);
    }

// setting the clock to the current time
    public void set_actual_time() {
        LocalTime initial = LocalTime.now();
        this.minute.setLoc(initial.getMinute());
        this.second.setLoc(initial.getSecond());
        setHourForm(initial.getHour());
    }

    public void setHourForm(int hr) {
        int minn;
        minn = this.minute.getLoc();
        if(hr >= 12) {
            hr = (hr - 12)*5;
        } else {
            hr = hr*5;
        }
        if((minn<12) && (minn >= 0)) {
            hr = hr + 0;
        } else if((minn<24) && (minn >= 12)) {
            hr = hr + 1;
        } else if((minn<36) && (minn >= 24)) {
            hr = hr + 2;
        } else if((minn<48) && (minn >= 36)) {
            hr = hr + 3;
        } else {
            hr = hr + 4;
        }
        this.hour.setLoc(hr);
    }

    public void animation(Window window) {
        set_actual_time();
        int s, min, h;
        s = this.second.getLoc();
        min = this.minute.getLoc();
        h = this.hour.getLoc();
        int move = 0;
        while(true) {
            try {
				Thread.sleep(999);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}

            this.second.pin_move();
            ++s;
            window.repaint();

            
            if(s == 60) {
                s = 0;
                ++min;
                move = 0;
                this.minute.pin_move();
                if(min == 60) {
                    min = 0;
                }
            }
            if (min%12 == 0 && move == 0 && min != 0) {
                h++;
                move = 1;
                this.hour.pin_move();
                if(h == 60) {
                    h = 0;
                }
            }
        }
    }
}