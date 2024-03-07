import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazUsuario {

    public static void Interfaz (){

        while (true) {
            try {
            } catch (InputMismatchException a) {
                System.out.println("No es el numero correcto");
            }finally{

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M3;
        String REF;
        Resultados salida;

        while (true) {
            try {
                System.out.print("M3: ");
                M3 = sc.nextInt();

                if (M3<1) throw new InputMismatchException("Numero Negativo");

                System.out.print("Ref: ");
                REF = sc.next();
                System.out.println("");
    
                salida=Calculos.calculos(REF,M3);
                
                System.out.println("Precio total: " + salida.PrecioTotal);
                System.out.println("Unidades: " + salida.Unidades);
                System.out.println("Precio m3: " + salida.PrecioM3);
        
            } catch (InputMismatchException e) {
                System.out.println("No es entero " + (e.getMessage()));
            }catch (ArithmeticException e) {
                System.out.println("Datos en catalogo erroneos ");
            }catch (NullPointerException e) {
                System.out.println("Referencia no existe: ");  
            } catch (Exception e) {
                System.out.println("Error: ");
            }
            sc.nextLine();
        }
    }
}