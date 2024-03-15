import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LeerGalaxia {
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        File x = new File("SAC.bin");
        FileInputStream fs = new FileInputStream(x);
        ObjectInputStream os = new ObjectInputStream(fs);

        while (true){
            try {
                Galaxia a = (Galaxia)os.readObject();
                System.out.println(a);
                os.close();
                fs.close();
            } catch (Exception e) {
                break;
            }
        }
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 


}



}
