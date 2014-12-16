import javax.swing.*;
import java.awt.*;

/**
 * Created by slava on 15.12.14.
 */
public class Frame extends JFrame {
    LoadMaze load = new LoadMaze();
    oneOrganism orgField[][];
    public String[] map;
    public GraphPanel graph;
    public changeState decide;
    Frame(){
        setAll();
        init();
        graph = new GraphPanel(orgField);
        decide = new changeState(orgField, orgField[0].length, orgField.length);
        add(graph, BorderLayout.CENTER);

    }
    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(orgField[0].length*50+20, (orgField.length*50+50));
        System.out.println(orgField.length + ":" + (orgField.length*50+20));
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
