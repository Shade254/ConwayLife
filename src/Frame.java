import javax.swing.*;
import java.awt.*;


/**
 * Created by slava on 15.12.14.
 */
public class Frame extends JFrame {
    LoadMaze load = new LoadMaze();
    oneOrganism orgField[][];
    public String[] map;
    public BossCls head;

    Frame(){
        setAll();
        init();
        head = new BossCls(orgField);
        add(head.graph, BorderLayout.CENTER);
        head.goodTiming();

    }
    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(orgField[0].length*30+20, (orgField.length*30+50));
        setResizable(false);
        setVisible(true);
    }
    public void setAll(){
        map = load.read(JOptionPane.showInputDialog(null, "Enter file name"));
        orgField = new oneOrganism[map.length][map[0].length()];
        for(int i = 0;i<map.length;i++){
            for(int x = 0;x<map[i].length();x++){
                if(map[i].charAt(x)=='#') {
                    orgField[i][x] = new oneOrganism(false, i, x);
                }
                else if(map[i].charAt(x) == '*'){
                    orgField[i][x] = new oneOrganism(true, i, x);
                }

            }
        }
    }
}
