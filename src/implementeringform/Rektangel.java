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

    public class Rektangel extends Form {

    private int bas;
    private int hojd;
    private boolean fylld;
    private int startX;
    private int startY;

    public Rektangel(int x, int y, int bas, int hojd, boolean fylld) {
        super(x, y);
        this.bas = bas;
        this.hojd = hojd;
        this.fylld = fylld;
        this.startX = x;
        this.startY = y;
        color = new Color ((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

        /**
         *
         * @param g
         */
        @Override
    public void draw(Graphics g) {
        g.setColor(color);

        if (fylld) {
            g.fillRect(xPos-(bas/2), yPos-(hojd/2), bas, hojd);
        } else {
            g.drawRect(xPos, yPos, bas, hojd);
        }
    }
        
        @Override
    public double getArea() {
        return bas * hojd;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String whatAmI() {
        return "Jag är en rektangel";
    }
    }
    


