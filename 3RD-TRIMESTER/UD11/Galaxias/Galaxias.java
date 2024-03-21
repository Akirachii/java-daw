
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;


public class Galaxias {
    
    public static void main(String[] args) {
        File f = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        File x = new File("SAC.bin");
        try {

            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            FileOutputStream xs = new FileOutputStream(x, true);
            ObjectOutputStream oos = new ObjectOutputStream(xs);
            String linea;
            linea = bf.readLine();
            while ((linea)!= null){
                String partes[] = linea.split(",");
                String object=partes[0];
                String con=partes[3];
                String ra=partes[4];
                String dec=partes[5];
                String mag=partes[6];
                String type=partes[2];

    
                if (type.equals("\"GALXY\"")){
                    Galaxia a = new Galaxia(object,con,ra,dec,mag);
                    //System.out.println(a);

                    oos.writeObject(a);
                    System.out.println(a);


                }
                
                linea = bf.readLine();
            }
            oos.close();
            xs.close();


        } catch (Exception e) {
            // TODO: handle exception
        } 

    }

}
