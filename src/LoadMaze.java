import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by slava on 15.12.14.
 */
public class LoadMaze{
    public String[] read(String file){
        int lineNum = returnMax(file);
        String[] maze = new String[lineNum];
        try{


            BufferedReader read = new BufferedReader(new FileReader(new File(file)));
            String lajny;
            int count = 0;


            while((lajny = read.readLine()) != null){
                maze[count] = lajny;
                count++;
            }
            return maze;


        }
        catch(IOException a){
            System.out.println(a);
            System.exit(0);
            return maze;
        }


    }
    public int returnMax(String file){
        try{
            BufferedReader read = new BufferedReader(new FileReader(new File(file)));
            int count = 0;
            while(read.readLine() != null){
                count++;
            }
            return count;
        }
        catch(IOException a){
            System.out.println(a);
            return 0;
        }
    }
}
