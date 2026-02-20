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
public class Triangel extends Form {

    private int bas;
    private int hojd;
    private boolean fylld;
    private int startX;
    private int startY;

    public Triangel(int x, int y, int bas, int hojd, boolean fylld) {
        super(x, y);
        this.bas = bas;
        this.hojd = hojd;
        this.fylld = fylld;
        this.startX = x;
        this.startY = y;
        color = new Color ((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        if(running)
            move(0,0);
        g.setColor(color);

        int[] xs = { xPos-bas/2, xPos, xPos + bas/2 };
        int[] ys = { yPos + hojd/2, yPos - hojd/2, yPos + hojd/2};

        if (fylld) {
            g.fillPolygon(xs, ys, 3);
        } else {
            g.drawPolygon(xs, ys, 3);
        }
    }
    
    @Override
    public double getArea() {
        return (bas * hojd) / 2.0;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String whatAmI() {
        return "Jag är en triangel";
    }
    
}

