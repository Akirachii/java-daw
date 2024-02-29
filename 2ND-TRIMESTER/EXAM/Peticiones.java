public class Peticiones {
    private String pedidos;
    private String devoluciones;
    private double precio;
    private String nombre; 
    private String estado; 
    private String texto; 
    private static String ID;  
    private static int contadorID;   

    public Peticiones (String nombre , int mnemrp ){
         
    }
    public void PEyDE(String nombre, String producto, double precio, String IDp1) {
        contadorID = +1;
        this.nombre=nombre;
        this.ID=IDp1+contadorID;
        this.precio=precio;
    }

    public void RE(String nombre, String producto, String texto, String IDp1) {
        contadorID = +1;
        this.estado="Abierta";
        this.nombre=nombre;
        this.ID=IDp1+contadorID;
        this.texto=texto;
    }

    public void Estado(){
        if ("Abierta".equals(this.estado) ){
            this.estado="Cerrada";

        }else {
            this.estado = "Cerrada";
            System.out.println("Esta reclamacion ya esta cerrada");
        }
    }

    public void getPeticiones(){
        System.out.println(getID());
    }

    public static String getID(){
        return ID;
    }
    public void getAll(){
        return Peticiones.RE;
    }
}
