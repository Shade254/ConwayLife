import javax.swing.*;

/**
 * Created by slava on 15.12.14.
 */
public class Frame extends JFrame {
    LoadMaze load = new LoadMaze();
    oneOrganism orgField[][];
    public String[] map;

    Frame(){

        map = load.read(JOptionPane.showInputDialog(null, "Enter file name"));
        orgField = new oneOrganism[map.length][map[0].length()];
        for(int i = 0;i<map.length;i++){
            for(int x = 0;x<map[i].length();x++){
                orgField =
            }
        }


    }
}
