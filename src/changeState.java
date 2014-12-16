/**
 * Created by slava on 16.12.14.
 */
public class changeState {
    oneOrganism[][] orgField;
    int xlength;
    int ylength;


    changeState(oneOrganism[][] a, int x, int y){
        orgField = a;
        xlength = x;
        ylength = y;
    }
    public void check(int x, int y){
        int count = 0;
        for(int i = y-1;i<= y+1;i++){
            for(int a = x-1;a<= x+1;a++){
                if(i < 0 || a<0 ||i>ylength||a>xlength || (i == y && a == x)){
                }
                else if(orgField[i][a].statut){
                    count++;
                }
            }
        }
        if(orgField[y][x].statut){
            if(count<2 || count>3){
                orgField[y][x].statut = !orgField[y][x].statut;
            }
        }
        else if(count==3){
            orgField[y][x].statut = !orgField[y][x].statut;
        }

    }
}
