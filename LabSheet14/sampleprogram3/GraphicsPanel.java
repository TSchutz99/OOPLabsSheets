package LabSheet14.sampleprogram3;

//GraphicsPanel.java
/*This class inherits from JPanel to act as a container onto which we draw some graphics*/

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

   public void paintComponent(Graphics g){
       super.paintComponent(g);

       g.setColor(Color.BLUE);
       g.setFont(new Font("serif",Font.BOLD,18));
       g.drawString("Java Graphics",120,50);

       g.setColor(Color.GREEN);
       g.drawOval(50,100,50,75);

       g.setColor(Color.ORANGE);
       g.fillRect(150,100,75,50);

       g.setColor(Color.RED);

       int xpoints[] = {300, 350, 330, 310, 300};
       int ypoints[] = {100, 150, 180, 170, 130};
       int npoints = 5;

       g.drawPolygon(xpoints, ypoints, npoints);

       g.drawImage((new ImageIcon("labsheet14/sampleprogram3/aib.png")).getImage(),50,200,null);

   }
}