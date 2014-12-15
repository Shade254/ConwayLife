import javax.swing.*;

/**
 * Created by slava on 15.12.14.
 */
public class MainCls {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();
            }
        });

    }
}
