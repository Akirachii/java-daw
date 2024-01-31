import java.util.Scanner;


public class Cafetera {
    public int CapacidadMaxima;
    public int CapacidadMinima;
    public int CapacidadActual;

    public Cafetera(){
        this.CapacidadMaxima = 1000;
        this.CapacidadActual = 0;
    }
        // Constructor con capacidad máxima
    public Cafetera(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadMaxima;
    }
        // Constructor con capacidad máxima y cantidad actual
    public Cafetera(int CapacidadMaxima, int CapacidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = Math.min(CapacidadMaxima, CapacidadActual);
    }
    public int getActual(){
        return this.CapacidadActual;
    }
    public void setActual(int newActual){
        this.CapacidadActual = newActual;
    }

    public void servirTaza(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a servir debe ser mayor que cero.");
        } else if (cantidad <= this.CapacidadActual) {
            this.CapacidadActual -= cantidad;
            System.out.println("Se ha servido una taza con " + cantidad + " ml de café.");
        } else {
            System.out.println("No hay suficiente café en la cafetera. Se ha servido lo que quedaba.");
            this.CapacidadActual = 0;
        }
    }

    public void llenarCafetera() {
        this.CapacidadActual = this.CapacidadMaxima;
        System.out.println("La cafetera ha sido llenada hasta su capacidad máxima.");
    }
    public void VaciarCafetera() {
        this.CapacidadActual = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }

    //  agregarCafe(int): añade a la cafetera la cantidad de café indicada
    
    public void addCafe(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a agregar debe ser mayor que cero.");
        } else if (cantidad <= this.CapacidadActual) {
            this.CapacidadActual += cantidad;
            System.out.println("Se ha agregado " + cantidad + " ml de café.");
        } else {
            System.out.println("No hay suficiente espacio en la cafetera. Se ha llenado.");
            this.CapacidadActual = CapacidadMaxima;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an instance of Cafetera with default values
        Cafetera cafetera = new Cafetera();
        boolean bool=false;
        while (!bool){
            System.out.println("---------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Servir una taza");
            System.out.println("2. Agregar cafe");
            System.out.println("3. vaciar cafetera");
            System.out.println("4. Maxear cafetera");
            System.out.println("5. Salir");
            System.out.println("---------------------------");
            System.out.print("Que haces?: ");
            String answ = sc.nextLine();
            switch (answ) {
                case "1": //servir 1 taza d cafe
                    System.out.println("Antes hay" + cafetera.getActual() + "ml de cafe");
                    cafetera.servirTaza(200);
                    System.out.println("Capacidad Actual Después de Servir Taza: " + cafetera.getActual());
                    break;
                case "2": //agregar cafe
                    int add = sc.nextInt();
                    cafetera.addCafe(add);
                    System.out.println("Capacidad Actual Después de agregar cafe: " + cafetera.getActual());
                    break;
                case "4": //Maxear cafetera
                    System.out.println("Antes hay" + cafetera.getActual() + "ml de cafe");
                    cafetera.llenarCafetera();
                    System.out.println("Ahora quedan : " + cafetera.getActual() + "ml de cafe");
                    break;
                case "3": //Vaciar cafetera
                    System.out.println("Antes hay" + cafetera.getActual() + "ml de cafe");
                     cafetera.VaciarCafetera();
                    System.out.println("Ahora quedan : " + cafetera.getActual() + "ml de cafe");
                    break;
                case "5": //Salir
                    System.out.println("En la cafetera habian : " + cafetera.getActual() + "ml de cafe");
                    bool=true;
                    break;
                default:
                    break;
            }
            
           
        }
    }
}

    
