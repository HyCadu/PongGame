package ponggame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Ball extends Rectangle {
    Random random;
    double xVelocity;
    double yVelocity;
    int inicialSpeed = 4 ;
    int angulo = new Random().nextInt(70);
    
    Ball(  int x, int y, int width, int heigth){
      super(x,y,width,heigth);
      random = new Random();
      double randomXDirection = Math.cos(Math.toRadians(angulo));
      
         setXDirection(randomXDirection*inicialSpeed);
      
      double randomYDirection = Math.sin(Math.toRadians(angulo));
         setYDirection(randomYDirection*inicialSpeed);
        
    }
    public void setXDirection (double d){
      xVelocity = d;
       }
    public void setYDirection (double d){
      yVelocity = d;
       }
    public void move(){
      x += xVelocity;
      y += yVelocity;
       }
    public void draw(Graphics g){
      g.setColor(Color.WHITE);
      g.fillOval(x, y, width, height);
    }
}
