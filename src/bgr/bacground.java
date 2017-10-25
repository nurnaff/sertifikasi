
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bgr;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author ROSIDI
 */
public class bacground extends JPanel {
    private Image image;

        public bacground(){
            image=new ImageIcon (getClass().getResource("/img/bgmenu.jpg")).getImage();
            }
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D gd =(Graphics2D)grphcs.create();
       gd.drawImage(image,0,0,getWidth(),getHeight(),null);
       gd.dispose();
    }

}
