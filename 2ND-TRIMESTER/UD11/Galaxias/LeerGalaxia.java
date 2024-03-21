import java.io.DataInput;
import java.io.EOFException;
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


        



        while (pepe.equals(a.getObject())) {
            System.out.println("es igual");
        }
        while (true){
            try {
                Galaxia a = (Galaxia)os.readObject();
                System.out.println(a);
            
                String pepe = sc.nextLine();

            
                
            } catch (EOFException e) {
                System.out.println("Final de fichero");    
                break;
            }catch (Exception e) {   
                e.printStackTrace();
                break;
            }

        }
        os.close();
        fs.close();
    } catch (IOException e) {
        e.printStackTrace();
    } 


}



}
