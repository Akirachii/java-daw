import java.util.InputMismatchException;
import java.util.Scanner;

public class InOk {
    static Scanner sc= new Scanner(System.in);
    public static void LeeInt(){

        try {
            int juab = sc.nextInt();    
        } catch (Exception e) {
            System.out.println("ola");
        }
    }

    public static void LeeIntPos(){
        try {
            int numero = sc.nextInt();
            if (numero < 0) throw new Exception(); 
        } catch (InputMismatchException a){
            System.out.println("debe ser un numero");
        } catch (Exception e) {
            System.out.println("Negativo");
        }
    }

    public static void LeeIntRango(){
        try {
            int num =sc.nextInt();
            int rango1 = sc.nextInt();
            int rango2 = sc.nextInt();
            if (num < rango1 || num > rango2) throw new Exception();
        } catch (Exception s) {
            System.out.println("No esta en el rango");
        }
    }

    public static void LeeDou(){
        try {
            double mum = sc.nextDouble();

        } catch (Exception e) {
            System.out.println("debe ser un double");
        }
    }

    public static void LeeDouRango(){
        
        try {
            double mum = sc.nextDouble();
            double rango1= sc.nextDouble();
            double rango2= sc.nextDouble();
            if (mum < rango1 || mum > rango2) throw new Exception();
        } catch (Exception e) {
            System.out.println("debe ser un double en el rango indicado");
        }
    }

    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};


    public static int buscarCompositor() throws ElementoNoExistente {
        System.out.println("Ingrese el nombre del compositor:");
        String nombre = sc.nextLine();

        for (int i = 0; i < COMPOSITORES.length; i++) {
            if (nombre.equals(COMPOSITORES[i])) {
                return i; 
            }
        }
        throw new ElementoNoExistente("El compositor " + nombre + " no existe en la lista.");
    }



    public static void main(String[] args) {
        try {
            int indice = buscarCompositor();
            System.out.println("El compositor se encuentra en la posición " + indice + " del array.");
        } catch (ElementoNoExistente e) {
            System.out.println(e.getMessage());
        }
    }
}