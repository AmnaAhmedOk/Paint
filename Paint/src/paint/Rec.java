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
public class Rec extends Shaps  {
    public Rec(int x1, int y1, int x2, int y2, Color color, int s) {
        super(x1, y1, x2, y2, color, s);
    }

  
  @Override
    void draw(Graphics g) {
         g.setColor(color);
          Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(s));
        if((x2-x1)<0&&(y2-y1)<0)
  {g.drawRect(x2,y2, Math.abs(x1-x2), Math.abs(y1-y2));
   }  
    if((x2-x1)>0&&(y2-y1)<0)
  { 
    g.drawRect(x1,y2, Math.abs(x1-x2), Math.abs(y1-y2));
   }
  if((x2-x1)>0&&(y2-y1)>0)
  { 
    g.drawRect(x1,y1, Math.abs(x1-x2), Math.abs(y1-y2));
   }
     if((x2-x1)<0&&(y2-y1)>0)
  { 
    g.drawRect(x2,y1, Math.abs(x1-x2), Math.abs(y1-y2));
   }
    }

    @Override
    void fill(Graphics g) {
              g.setColor(color);
          Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(s));
        if((x2-x1)<0&&(y2-y1)<0)
  {g.fillRect(x2,y2, Math.abs(x1-x2), Math.abs(y1-y2));
   }  
    if((x2-x1)>0&&(y2-y1)<0)
  { 
    g.fillRect(x1,y2, Math.abs(x1-x2), Math.abs(y1-y2));
   }
  if((x2-x1)>0&&(y2-y1)>0)
  { 
    g.fillRect(x1,y1, Math.abs(x1-x2), Math.abs(y1-y2));
   }
     if((x2-x1)<0&&(y2-y1)>0)
  { 
    g.fillRect(x2,y1, Math.abs(x1-x2), Math.abs(y1-y2));
   }
   
    
    }  
}
