
import java.io.Serializable;

public class Galaxia implements Serializable {
    private String object;
    private String con;
    private String ra;
    private String dec;
    private String mag;

    public Galaxia(String object, String con, String ra, String dec, String mag) {
        this.object = object.replaceAll("\\s", "").replaceAll("\"","");
        this.con = con.replaceAll("\"","");
        this.ra =ra.replaceAll("\"","");
        this.dec=dec.replaceAll("\"","");
        this.mag=mag.replaceAll("\"","");   
    }


    
    public String toString() {
        return (object + " , " + con + " , " + ra + " , " + dec + " , " + mag);
    }


}
