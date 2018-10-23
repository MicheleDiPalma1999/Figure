
package figura;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

class JBersaglio extends JPanel {
    
    int x;
    int y;
    int z;
    int j;

    public JBersaglio(int x, int y, int z, int j) {
        setBackground(Color.cyan);
        this.x = x*100;
        this.y = y*100;
        this.z = z*100;
        this.j = j*100;
        setPreferredSize(new Dimension(1200,1200));
    }
 
    // Tracciamento della grafica
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(Color.lightGray);
        page.setColor(Color.yellow);
        page.fillRect(x, y, z, j);
    }
}
