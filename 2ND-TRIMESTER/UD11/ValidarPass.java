import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarPass {
    //Pau Gradoli

    static Scanner sc = new Scanner(System.in);
    static String file = "pass.txt";
    static File P = new File(file);

    public static void Guardar() {
         
        try {
            
            if (P.exists()){                
                FileWriter fw = new FileWriter(file, true);
                System.out.println("Usuario: ");
                String user = sc.next();
                System.out.println("Contraseña: ");
                String passwd = sc.next();

                fw.write(user + ":" + passwd + "\n");
                fw.close();
            } else System.out.println("Fichero no existe --- Creando"); P.createNewFile();
                
            
        } catch(Exception e) {
            System.err.println("Error leyendo/escribiendo fichero"); 
        }

    }
    public static void Validar() {
        try {
            if (P.exists()){     
                FileReader in = new FileReader(file);           
                BufferedReader fr = new BufferedReader(in);
                System.out.println("Usuario: ");
                String user = sc.next();
                System.out.println("Contraseña: ");
                String passwd = sc.next();


                String linea;
                boolean valido = false;
                while ((linea = fr.readLine())!= null){
                    String partes[] = linea.split(":");
                    String user2=partes[0];
                    String passw=partes[1];

                    if (user.equals(user2) && passwd.equals(passw)) {
                        valido = true;
                    }
                    
                }
                if (valido) {
                    System.out.println("Credenciales válidas");
                } else {
                    System.out.println("Credenciales inválidas");
                }
                fr.close();
            } else System.out.println("Fichero no existe");
            
        } catch (Exception e) {
            System.out.println("algun error");
        }
    }
    

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("¿Guardamos[1] o Validamos[2]?      Salir[0]");
                int opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        Guardar();
                        break;
                    case 2:
                        Validar();
                        break;
                    case 0:
                        exit=true;
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("No es una opcion requerida");
        
            }


        }

    }

}
