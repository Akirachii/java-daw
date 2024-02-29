import java.util.Scanner;
public class UsarEjercicio1 {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);       
        String nombre = sc.nextLine();  
        String estado = sc.nextLine();         
        String producto = sc.nextLine(); 
        String texto = sc.nextLine(); 
        String precio = sc.nextLine();
        String IDp1 = "A";
        
        
        boolean bool=false;
        while (!bool){
            System.out.println("---------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Crear pedido");
            System.out.println("2. Crear devolucion");
            System.out.println("3. Crear reclamacion");
            System.out.println("4. Cerrar reclamación");
            System.out.println("5. Imprimir formulario por ID");
            System.out.println("6. Imprimir todas las reclamaciones");
            System.out.println("7. Imprimir todos los formularios");
            System.out.println("0. Salir");
            System.out.println("---------------------------");
            System.out.print("Opcion: ");
            String answ = sc.nextLine();
            switch (answ) {
                case "1": 
                    System.out.print("Nombre Cliene:");
                    nombre = sc.nextLine();
                    System.out.println("Producto:");
                    producto = sc.nextLine();
                    System.out.println("Precio:");
                    precio = sc.nextLine();
                    IDp1 = "PE";
                    Peticiones p1 = new PEyDE(nombre,producto,precio,IDp1);
                    System.out.println("ID Formulario" + Peticiones.getID());
                    break;
                case "2": 
                    System.out.print("Nombre Cliene:");
                    nombre = sc.nextLine();
                    System.out.println("Producto:");
                    producto = sc.nextLine();
                    System.out.println("Precio:");
                    precio = sc.nextLine();
                    IDp1 = "DE";
                    Peticiones d1 = new PEyDE(nombre,producto,precio,IDp1);
                    System.out.println("ID Formulario" + Peticiones.getID());
                    break;
                case "3": //RECLAMACION
                    System.out.print("Nombre Cliene:");
                    nombre = sc.nextLine();
                    System.out.println("Producto:");
                    producto = sc.nextLine();
                    System.out.println("Texto:");
                    texto = sc.nextLine();
                    IDp1 = "RE";
                    Peticiones r1 = new RE(nombre,producto,texto,IDp1);
                    System.out.println("ID Formulario" + Peticiones.getID());
                    break;
                case "4": 
                    System.out.print("ID: ");
                    nombre = sc.nextLine();
                    nombre.Estado();
                    break;
                case "7": 
                    Peticiones.getAll();
                    break;
                case "0": //Salir
                    System.out.println("Exited");
                    bool=true;
                    break;
                default:
                    break;
            }
        }
    }
}
