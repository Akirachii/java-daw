
import java.io.File;
import java.util.Scanner;

public class Rjm {
    public static void main(String[] args) {
        String ruta;
        Scanner sc = new Scanner(System.in);
        try {
            ruta=args[0];
            if(ruta != null) {
                File f = new File(ruta); 
                if(f.isFile()) { 
                    f.delete();
                }if (f.isDirectory()) {
                    System.out.println("Es un directorio");
                }else  {
                    System.out.println("Fichero no existia");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No hay argumentos");
        }
    }
    
}
