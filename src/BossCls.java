import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by slava on 12/19/14.
 */
public class BossCls {
    public Timer timer = new Timer();
    public oneOrganism[][] bossField;
    public changeState decide;
    public GraphPanel graph;

    BossCls(oneOrganism[][] field){
        bossField = field;
        graph = new GraphPanel(field);
        decide = new changeState(bossField, bossField[0].length, bossField.length);
        }
    public void goodTiming(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                decide.checkAll(bossField);
                for(int i = 0;i<bossField.length;i++){
                    for(int b = 0;b<bossField[i].length;b++){
                        bossField[i][b] = new oneOrganism(decide.orgField[i][b].statut, i, b);
                    }
                }
                graph.set(bossField);

            }
        }, 500, 500);
    }

}
