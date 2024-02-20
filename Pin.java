import java.awt.*;

public class Pin {

    private int loc = 0;
    private int cos;
    private int sin;

    // constructor
    public Pin() {

    }

    // getter
    public int getLoc() {
        return loc;
    } public int getCos() {
        return cos;
    } public int getSin() {
        return sin;
    }

    // Setter
    public void setLoc(int loc) {
        this.loc = loc;
    } public void setCos(int cos) {
        this.cos = cos;
    } public void setSin(int sin) {
        this.sin = sin;
    }

// creation of pin
    public void create_pin(Graphics g, int length, int reference) {

        if(this.getLoc() == 60) {
            this.setLoc(0);
        }
        g.drawLine(reference/2, reference/2, reference/2 + reference*length/100*this.getCos()/1000, reference/2 - reference*length/100*this.getSin()/1000);
    }

// Pin deplacement
    public void pin_move() {
        int news;
        news =  this.getLoc() + 1;
        
        this.setLoc(news);
    }

// Pin location
    public void location_pin(int location) {
        int i;
        switch(location) {
            case 0:
                this.setCos((int) ((Math.cos(Math.PI*(15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(15)/30)) * 1000));
                break;
            
            case 1:
                i = 1;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 2:
                i = 2;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 3:
                i = 3;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 4:
                i = 4;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 5:
                i = 5;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 6:
                i = 6;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case  7:
                i = 7;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case  8:
                i = 8;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case  9:
                i = 9;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 11:
                i = 11;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 12:
                i = 12;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 13:
                i = 13;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 14:
                i = 14;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 15:
                i = 15;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 16:
                i = 16;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 17:
                i = 17;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 18:
                i = 18;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 19:
                i = 19;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 20:
                i = 20;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 21:
                i = 21;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 22:
                i = 22;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 23:
                i = 23;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 24:
                i = 24;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;
            case 25:
                i = 25;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 26:
                i = 26;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 27:
                i = 27;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 28:
                i = 28;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 29:
                i = 29;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 30:
                i = 30;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 31:
                i = 31;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 32:
                i = 32;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 33:
                i = 33;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 34:
                i = 34;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 35:
                i = 35;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 36:
                i = 36;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 37:
                i = 37;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 38:
                i = 38;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 39:
                i = 39;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 40:
                i = 40;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 41:
                i = 41;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 42:
                i = 42;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 43:
                i = 43;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 44:
                i = 44;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 45:
                i = 45;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 46:
                i = 46;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 47:
                i = 47;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 48:
                i = 48;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 49:
                i = 49;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 50:
                i = 50;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 51:
                i = 51;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 52:
                i = 52;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 53:
                i = 53;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 54:
                i = 54;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 55:
                i = 55;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 56:
                i = 56;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 57:
                i = 57;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 58:
                i = 58;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 59:
                i = 59;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;

            case 60:
                i = 60;
                this.setCos((int) ((Math.cos(Math.PI*(i+15)/30)) * 1000));
                this.setSin((int) ((Math.sin(Math.PI*(i+15)/30)) * 1000));
                break;
            
        }
    }   
}