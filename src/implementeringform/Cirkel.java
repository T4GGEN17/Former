/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementeringform;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author taglu01
 */
public class Cirkel extends Form {

    private int radie;
    private boolean fylld;
    private int startX;
    private int startY;

    public Cirkel(int x, int y, int radie, boolean fylld) {
        super(x, y);
        this.radie = radie;
        this.fylld = fylld;
        this.startX = x;
        this.startY = y;
        color = new Color ((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }
    @Override
    public double getArea() {
        return Math.PI * radie * radie;
}

    @Override
    public void draw(Graphics g) {
        if(running)
            move(0,0);
        g.setColor(color);
            g.fillOval(xPos-radie, yPos-radie, radie * 2, radie * 2);
            
/*        if (fylld) {
            g.fillOval(xPos-radie, yPos-radie, radie * 2, radie * 2);
        } else {
            g.drawOval(xPos, yPos, radie * 2, radie * 2);
        }*/
    }

    /**
     *
     * @return
     */
    @Override
    public String whatAmI() {
        return "Jag är en cirkel";
    }
    }