/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ITI
 */
abstract public class Shaps {
    int x1,y1,x2,y2,s;
       Color color;
    public Shaps(int x1, int y1, int x2, int y2,Color color,int s) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color=color;
        this.s=s;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getS() {
        return s;
    }

    public Color getColor() {
        return color;
    }
    
    void setp1(int x,int y)
    {
        x1=x;
        y1=y;
    }
    
      void setp2(int x,int y)
    {
        x2=x;
        y2=y;
    }
      
    abstract void draw(Graphics g) ;  
    abstract void fill(Graphics g) ;  
 
}
