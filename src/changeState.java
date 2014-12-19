/**
 * Created by slava on 16.12.14.
 */
public class changeState {
    oneOrganism[][] orgField;
    int xlength;
    int ylength;


    changeState(oneOrganism[][] a, int x, int y) {
        orgField = new oneOrganism[a.length][a[0].length];
        for(int i = 0;i<orgField.length;i++){
            for(int b = 0;b<orgField[i].length;b++){
                orgField[i][b] = new oneOrganism(a[i][b].statut, i, b);
            }
        }
        xlength = x;
        ylength = y;
    }

    public void checkAll(oneOrganism[][] field) {
        for(int i = 0;i<orgField.length;i++){
            for(int b = 0;b<orgField[i].length;b++){
                orgField[i][b] = new oneOrganism(field[i][b].statut, i, b);
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int x = 0; x < field[i].length; x++) {
                check(i, x, field);
            }
        }
    }

    public void check(int y, int x, oneOrganism[][] field) {

        int count = 0;
        for (int i = y - 1; i <= y + 1; i++) {
            for (int a = x - 1; a <= x + 1; a++) {

                if (i < 0 || a < 0 || i >= ylength || a >= xlength || (i == y && a == x)) {

                } else if (field[i][a].statut) {
                    count++;

                }
                else{

                }
            }
        }
        if (orgField[y][x].statut) {
            if (count < 2 || count > 3) {
                orgField[y][x].statut = !orgField[y][x].statut;

            }
        }
        else if (count == 3) {
            orgField[y][x].statut = !orgField[y][x].statut;


        }

    }

}
