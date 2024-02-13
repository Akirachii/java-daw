package UD9;

public class Vehiculos {
    
}



while (!bool){
    System.out.println("---------------------------");
    System.out.println("Menu: ");
    System.out.println("1. Servir una taza");
    System.out.println("2. Agregar cafe");
    System.out.println("3. vaciar Vehiculos");
    System.out.println("4. Maxear Vehiculos");
    System.out.println("5. Salir");
    System.out.println("---------------------------");
    System.out.print("Que haces?: ");
    String answ = sc.nextLine();
    switch (answ) {
        case "1": //servir 1 taza d cafe
            System.out.println("Antes hay" + Vehiculos.getActual() + "ml de cafe");
            Vehiculos.servirTaza(200);
            System.out.println("Capacidad Actual Después de Servir Taza: " + Vehiculos.getActual());
            break;
        case "2": //agregar cafe
            int add = sc.nextInt();
            Vehiculos.addCafe(add);
            System.out.println("Capacidad Actual Después de agregar cafe: " + Vehiculos.getActual());
            break;
        case "4": //Maxear Vehiculos
            System.out.println("Antes hay" + Vehiculos.getActual() + "ml de cafe");
            Vehiculos.llenarVehiculos();
            System.out.println("Ahora quedan : " + Vehiculos.getActual() + "ml de cafe");
            break;
        case "3": //Vaciar Vehiculos
            System.out.println("Antes hay" + Vehiculos.getActual() + "ml de cafe");
             Vehiculos.VaciarVehiculos();
            System.out.println("Ahora quedan : " + Vehiculos.getActual() + "ml de cafe");
            break;
        case "5": //Salir
            System.out.println("En la Vehiculos habian : " + Vehiculos.getActual() + "ml de cafe");
            bool=true;
            break;
        default:
            break;
    }
    
   
}