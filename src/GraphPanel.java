import javax.swing.*;
import java.awt.*;

/**
 * Created by slava on 15.12.14.
 */
public class GraphPanel extends JPanel {
    oneOrganism[][] map;
    GraphPanel(oneOrganism[][] field){
        map = field;
    }
    public void set(oneOrganism[][] field){
        map = field;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0;i<map.length;i++){
            for(int x = 0;x<map[0].length;x++){

                if(map[i][x].statut){
                    g.setColor(Color.GREEN);
                }
                else{
                    g.setColor(Color.BLACK);
                }
                g.fillRect(10+x*30, 10+i*30, 30, 30);
                g.setColor(Color.GREEN);
                g.drawRect(10+x*30, 10+i*30, 30, 30);
            }
        }

    }
}
