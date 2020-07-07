/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
/**
 *
 * @author ITI
 */
public class PaintClass extends Applet implements ActionListener {
 
  // JButton v = new JButton("vvvvv");
   
    Button yellow,earser, red, blue, black, cyan, green, gray, dark_gray, mag, white, pink, orange, light_gray , line_btn, cicle_btn, rec_btn, recRound_btn,fill_cir,fill_rec,fill_round,b1,b2,b3;
    private boolean dragging = false;
    int btn = 0,bruch=1;
    Shaps line,cicle,rec,recR;
    ArrayList<Shaps> lines = new ArrayList<>();
    ArrayList<Shaps> circles = new ArrayList<>();
    ArrayList<Shaps> recs = new ArrayList<>();
    ArrayList<Shaps> recRs = new ArrayList<>();
     ArrayList<Shaps> fillc = new ArrayList<>();
    ArrayList<Shaps> fillrec = new ArrayList<>();
    ArrayList<Shaps> fillr = new ArrayList<>();
    ArrayList<Shaps> earsers = new ArrayList<>();
    Color clr = Color.BLACK;

    @Override
    public void actionPerformed(ActionEvent e) {
        //draw Buttons
        if (e.getSource() == line_btn) {
            btn = 1;         
        }
        if (e.getSource() == cicle_btn) {
            btn = 2;
        }
        if (e.getSource() == rec_btn) {
            btn = 3;
        }
        if (e.getSource()== recRound_btn) {
            btn=4;
        }
        if (e.getSource()== fill_cir) 
            btn=5;
            if (e.getSource()== fill_rec) 
            btn=6;
            if (e.getSource()== fill_round) 
            btn=7;
            /////bruch
            if(e.getSource()==b1)
                bruch=1;
            if(e.getSource()==b2)
                bruch=4;
            if(e.getSource()==b3)
                bruch=7;
            if(e.getSource()==b3) //eras
                btn=8;
            
            //////////////////////////////colors
        if (e.getSource() == yellow) 
            clr = Color.YELLOW;
        if (e.getSource() == blue) 
            clr = Color.BLUE;
        if (e.getSource() == black) 
            clr = Color.BLACK;
          if (e.getSource() == red)
            clr = Color.red;
            if (e.getSource() == gray) 
            clr = Color.gray;
         if (e.getSource() == orange) 
            clr = Color.ORANGE;
            if (e.getSource() == green) 
            clr = Color.green;
          
            if (e.getSource() == pink) 
            clr = Color.pink;
             if (e.getSource() == white) 
            clr = Color.WHITE;
             if (e.getSource() == dark_gray) 
            clr = Color.darkGray;
             if (e.getSource() == light_gray) 
            clr = Color.lightGray;
             if (e.getSource() == cyan) 
            clr = Color.cyan;
             if (e.getSource() == mag) 
            clr = Color.MAGENTA;
//if(e.gline_btn)
        //if(e.gline_btn)
    }

    public void init() {
        this.setLayout(null);
       // add(f);
      
        
        
         earser=setBtn(earser,"eraser", 20, 0);
        yellow = setBtn(yellow, Color.YELLOW, 700, 20);
        red = setBtn(red, Color.RED, 700, 40);
        black = setBtn(black, Color.BLACK, 700, 60);
        blue = setBtn(blue, Color.BLUE, 760, 20);
        cyan = setBtn(cyan, Color.CYAN, 720, 40);
        dark_gray = setBtn(dark_gray, Color.DARK_GRAY, 720, 60);
        gray = setBtn(gray, Color.GRAY, 760, 40);
        green = setBtn(green, Color.GREEN, 740, 40);
        light_gray = setBtn(light_gray, Color.LIGHT_GRAY, 740, 60);
        mag = setBtn(mag, Color.MAGENTA, 760, 60);
        orange = setBtn(orange, Color.ORANGE, 720, 20);

        pink = setBtn(pink, Color.PINK, 740, 20);
        white = setBtn(white, Color.WHITE, 780, 60);
        line_btn = setBtn(line_btn,"Line",20,150);
        cicle_btn = setBtn(line_btn,"Circle",20,220);
        rec_btn = setBtn(line_btn,"Rectangle",20,290);
        recRound_btn =setBtn(line_btn,"Rounded",20,360);
        fill_rec = setBtn(line_btn,"Fill Rctangle",20,430);
        fill_cir = setBtn(line_btn,"Fill Circle",20,500);
        fill_round= setBtn(line_btn,"fill Round",20,570);
         b1= setBtn(b1,Color.BLACK,300,50);
         b2= setBtn(b2,Color.BLACK,325,50);
         b3= setBtn(b3,Color.BLACK,350,50);
      // getContentPane(). add(b1);
      add(b2);
       add(b1);
       add(b3);
         add(earser);
       add(fill_cir);
       add(fill_rec);
       add(fill_round);
        add(line_btn);
        add(cicle_btn);
        add(rec_btn);
        add( recRound_btn);
        add(yellow);
        add(red);
        add(blue);
        add(cyan);
        add(black);
        add(dark_gray);
        add(gray);
        add(green);
        add(light_gray);
        add(mag);
        add(orange);
        add(pink);
        add(white);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        fill_cir.addActionListener(this);
        fill_rec.addActionListener(this);
        fill_round.addActionListener(this);
         recRound_btn.addActionListener(this);
        yellow.addActionListener(this);
        red.addActionListener(this);
        black.addActionListener(this);
        blue.addActionListener(this);
        cyan.addActionListener(this);
        dark_gray.addActionListener(this);
        gray.addActionListener(this);
        pink.addActionListener(this);
        light_gray.addActionListener(this);
        mag.addActionListener(this);
        white.addActionListener(this);
        green.addActionListener(this);
        orange.addActionListener(this);
        line_btn.addActionListener(this);
        cicle_btn.addActionListener(this);
        rec_btn.addActionListener(this);
        earser.addActionListener(this);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                //  start.add(new Point(e.getX(),e.getY()));
                 
                 
                if (btn == 1||btn==8) {
                    line = new Line(0, 0, 0, 0, clr, bruch);
                    line.setp1(e.getX(), e.getY());
                } else if (btn == 2||btn==5) {
                    cicle = new Circle(0, 0, 0, 0, clr, bruch);
                    cicle.setp1(e.getX(), e.getY());
                } 
                
                else if (btn == 3||btn==6) {
                    rec = new Rec(0, 0, 0, 0, clr, bruch);
                    rec.setp1(e.getX(), e.getY());
                }
                else if (btn == 4||btn==7) {
                    recR = new RoundedRec(0, 0, 0, 0, clr, bruch);
                    recR.setp1(e.getX(), e.getY());
                }
                
                dragging = false;

            }
        });

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
               // System.out.println(e.);
            }
           
            public void mouseReleased(MouseEvent e) {
                //  end.add(new Point(e.getX(),e.getY()));
                if (btn == 8) {
                    line .setp2(e.getX(), e.getY());
                     earsers.add(line);
                 }
                if (btn == 1) {
                    line.setp2(e.getX(), e.getY());
                    lines.add(line);
                } else if (btn == 2) {
                    cicle.setp2(e.getX(), e.getY());
                    circles.add(cicle);
                }
              
                else if (btn==5) {
                    cicle.setp2(e.getX(), e.getY());
                    //fillc.add(cicle);
                }
                
                else if (btn == 3) {
                    rec.setp2(e.getX(), e.getY());
                    recs.add(rec);
                }
                
                 else if (btn==6) {
                    rec.setp2(e.getX(), e.getY());
                    //fillrec.add(rec);
                }
                else if (btn == 4) {
                    recR.setp2(e.getX(), e.getY());
                    recRs.add(recR);
                }
                  else if (btn==7) {
                    recR.setp2(e.getX(), e.getY());
                    //fillr.add(recR);
                }
                dragging = false;
                   repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
             
                //  dragd.add( new Point(e.getX(),e.getY()));
                if (btn == 1||btn==8) {
                    line.setp2(e.getX(), e.getY());
                } else if (btn == 2||btn==5) {
                    cicle.setp2(e.getX(), e.getY());
                } else if (btn == 3||btn==6) {
                    rec.setp2(e.getX(), e.getY());
                }else if (btn == 4||btn==7) {
                    recR.setp2(e.getX(), e.getY());
                }
                dragging = true;
                repaint();
            }
        });
            }

    public void paint(Graphics g) {

        if (dragging) {

            if (btn == 1) {
                line.draw(g);
            } else if (btn == 2) {
                cicle.draw(g);
            } else if (btn == 3) {
                rec.draw(g);
            }
            else if (btn == 4) {
                recR.draw(g);
                
            }
             else if (btn == 5) {
                cicle.fill(g);
                fillc.add(cicle);
            }
            else if (btn == 6) {
                rec.fill(g);
                fillrec.add(rec);
            }
            else if (btn == 7) {
                recR.fill(g);
                fillr.add(recR);
            }
            else if (btn == 8) { /////////////////////////////////////////
                line.draw(g);
               earsers.add(line);
            }

        }
         for (int i = 0; i < fillc.size(); i++) {
            fillc.get(i).fill(g);

        }
           for (int i = 0; i < earsers.size(); i++) {
            earsers.get(i).fill(g);

        }
          for (int i = 0; i < fillrec.size(); i++) {
            fillrec.get(i).fill(g);

        }
          
           for (int i = 0; i < fillr.size(); i++) {
            fillr.get(i).fill(g);

        }
        for (int i = 0; i < recRs.size(); i++) {
            recRs.get(i).draw(g);

        }
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i).draw(g);

        }
        for (int i = 0; i < recs.size(); i++) {
            recs.get(i).draw(g);

        }
        for (int i = 0; i < circles.size(); i++) {
            circles.get(i).draw(g);

        }

    }
/*
    public void run() {

        while (true) {

            repaint();

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException is occured");

            }
        }
    }
*/
    public Button setBtn(Button b, Color c, int x, int y) {
        b = new Button("");
        b.setBackground(c);
        b.setBounds(x, y, 20, 20);
        return b;

    }
      public Button setBtn(Button b,String name, int x, int y) {
        b = new Button(name);
       
        b.setBounds(x, y, 100, 50);
        return b;

    }
     

}
