import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Explicacion {
    public static void crearFichero(){
        try{
            File file = new File("fichero.txt");
            if (file.createNewFile()) System.out.println("Fichero creado: " + file.getName());
            else System.out.println(file.getName() + " El fichero ya existe");
        }catch (IOException e) {
            System.out.println("Error: No puedo crear el fichero");
        }
    }

    public static void CrearDirectorio(){
        try{
            File directorio = new File("dirPruebas");
            if (directorio.mkdir()) {
                System.out.println("Creado: " + directorio.getName());
            } else {
                System.out.println("El directorio " + directorio.getName() + " ya existe");
            }
        }catch (Exception e) {
            System.out.println("Error: Al crear directorio");
        }
    }

    public static void SiExisteDir(){
        String ruta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ruta: ");
        ruta=sc.nextLine();
        if(ruta.length() > 0) {
            File f = new File(ruta); 
            if(f.isDirectory()) { 
                File[] ficheros = f.listFiles();
                System.out.println("Listado de los ficheros");
                for(File file : ficheros) System.out.println("\t" + file.getName());
            }
        }
    }

    public static void Reader(String nombre){
        try {
            File f = new File(nombre);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine(); //fr.read(), para un caracter
            System.out.println();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException a){
            System.out.println("No es un fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Reader(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No hay argumentos");
        }
    }    
}