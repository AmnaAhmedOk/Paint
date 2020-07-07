/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author ITI
 */
public class Line extends Shaps {

    public Line(int x1, int y1, int x2, int y2, Color color, int s) {
        super(x1, y1, x2, y2, color, s);
    }

   public Line(int x1, int y1,int x2,int y2) {
        super(x1, y1, x2, y2, Color.WHITE, 7);
    }
    @Override
    void draw(Graphics g) {
       
      
       Graphics2D g2 = (Graphics2D) g;
       g.setColor(color);
       
        g2.setStroke(new BasicStroke(s));
        g2.drawLine(x1,y1,x2,y2);
    }
    
    

    @Override
    void fill(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
