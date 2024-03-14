package Galaxias;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Galaxias {
    
    public static void main(String[] args) {
        File f = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        File x = new File("Gal.bin");
        try {
            String linea;
            while ((linea = f.readLine())!= null){
                String partes[] = linea.split(":");
                String object=partes[0];
                String con=partes[3];
                String ra=partes[4];
                String dec=partes[5];
                String mag=partes[6];

                Galaxia a = new Galaxia(object,con,ra,dec,mag);

                x.write(a);
            }





        } catch (Exception e) {
            // TODO: handle exception
        }



    }


}
