import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CEditar {
    // Pau Gradoli 
    public static void EditarFichero() {
        Scanner sc = new Scanner(System.in);
        String linea;
        try {
            System.out.println("Nombre del fichero: ");
            String nombre = sc.nextLine();
            File w = new File(nombre);

            if (w.exists()){
                System.out.println("Ya existe el fichero");
            } else {
                FileWriter fw = new FileWriter(nombre);
                System.out.println("Escribe 'q' para salir");
                while (!(linea = sc.nextLine()).equals("q")) {
                    fw.write(linea + "\n");
                }
                fw.close();
            }
            
        } catch(IOException e2) {
            System.err.println("Error leyendo/escribiendo fichero");
        }

    }

    public static void main(String[] args) {
        EditarFichero();
    }


}
