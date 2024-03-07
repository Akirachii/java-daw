import java.io.File;
import java.util.Scanner;

public class QueEs {
    public static void main(String[] args) {
        String ruta;
        Scanner sc = new Scanner(System.in);
        try {
            ruta=args[0];
            if(ruta != null) {
                File f = new File(ruta); 
                if (f.exists()){
                    if(f.isFile()) { 
                        System.out.println("Fichero: ");
                    }if (f.isDirectory()) {
                        System.out.println("Directorio: ");
                    }
                    f.getAbsolutePath();
                    f.getTotalSpace();

                    if (f.canRead()){
                        System.out.println("Puede Leer " + f.getName());
                    } else System.out.println("No puedes leer" + f.getName());
                    if (f.canWrite()){
                        System.out.println("Puede Escribir " + f.getName());
                    } else System.out.println("No puedes Escribir" + f.getName());
                    if (f.canExecute()){
                        System.out.println("Puede Ejecutar " + f.getName());
                    } else System.out.println("No puedes Ejecutar" + f.getName());
                }else System.out.println("No existe " + f.getName());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No hay argumentos");
        }
    }
}