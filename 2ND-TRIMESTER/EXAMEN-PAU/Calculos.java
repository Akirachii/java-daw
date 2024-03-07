import java.util.HashMap;

public class Calculos {
    public static Resultados calculos (String REF, long M3){

        Resultados salida=new Resultados();
        HashMap<String, Tablon> cat = Catalogo.listado();

        Tablon salTabl = cat.get(REF);

        long alto = salTabl.alto;
        long ancho = salTabl.ancho;
        long largo = salTabl.largo;
        float precio = salTabl.precio;

        salida.Unidades = (long)(M3*1000000000)/(alto*ancho*largo);
        salida.PrecioTotal = salida.Unidades*precio;
        salida.PrecioM3 = salida.PrecioTotal*M3;

        return salida;
    }
    
}