
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


    
    public  String getObject() {
        return object;
    }



    public  String getCon() {
        return con;
    }



    public  String getRa() {
        return ra;
    }



    public  String getDec() {
        return dec;
    }



    public  String getMag() {
        return mag;
    }



    public String toString() {
        return (object + " " + con + " " + ra + " " + dec + " " + mag);
    }


    public static String[] split(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'split'");
    }


}
