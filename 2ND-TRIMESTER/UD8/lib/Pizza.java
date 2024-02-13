package lib;
public class Pizza {

    private String tamanio;
    private String tipo;
    private String estado;  
    private static int TotalPedidas;
    private static int TotalServidas;

    public Pizza(String tipo ,String tamanio){
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.estado = "pedida";
        TotalPedidas += 1;
    }
    public void sirve(){
        if ("servida".equals(this.estado) ){
            System.out.println("esa pizza ya se ha servido");

        }else {
            this.estado = "servida";
            TotalServidas += 1;
        }
    }

    //geters
    public static int getTotalServidas(){
        return TotalServidas;
    }
    public static int getTotalPedidas(){
        return TotalPedidas;
    }

    public String toString(){
        return "pizza " + tipo + " , " + tamanio + " ," + estado;
    }

 
}
