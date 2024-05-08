
package ponggame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
    
    GamePanel painel = new GamePanel();
    
    GameFrame(){
     this.add(painel);
     this.setTitle("JOGO PONG");
     this.setResizable(false);
     this.setBackground(Color.black);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
     

    }
}
