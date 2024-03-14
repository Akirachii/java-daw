package Galaxias;

import java.io.Serializable;

public class Galaxia implements Serializable {
    private String object;
    private String con;
    private String ra;
    private String dec;
    private String mag;


    public Galaxia(String object, String con, String ra, String dec, String mag) {
        this.object = object;
        this.con = con;
        this.ra =ra;
        this.dec=dec;
        this.mag=mag;    
    }
    public void DatosGalaxia() {
        System.out.println(object + " , " + con + " , "+ " , " + ra + " , "+ " , " + dec + " , "+ " , " + mag);
    }


}
