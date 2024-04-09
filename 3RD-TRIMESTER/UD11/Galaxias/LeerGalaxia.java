import java.io.DataInput;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.management.ClassLoadingMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerGalaxia7 {
    
    public static void CallGalaxy(String search, int selected ) throws IOException{
        File x = new File("SAC.bin");
        FileInputStream fs = new FileInputStream(x);
        ObjectInputStream os = new ObjectInputStream(fs);
        try {
            //List<Galaxia> foundGalaxies = new ArrayList<>();
            while (true) {
                Galaxia a = (Galaxia) os.readObject();
                //System.out.println(a);
                if (a != null) {
                    switch (selected) {
                        case 1:
                            if (a.getObject().equalsIgnoreCase(search)) {
                                //foundGalaxies.add(a);
                                System.out.println(a.getCon() + " " + a.getRa() + " " +a.getDec() + " " + a.getMag());
                            }
                            break;
                        case 2:
                            if (a.getCon().equalsIgnoreCase(search)) {
                                //foundGalaxies.add(a);
                                System.out.println("CONSTE: " + a);
                            }
                            break;
                        case 3:
                            double number = Double.parseDouble(a.getMag());
                            double compare = Double.parseDouble(search);
                            if (number <= compare) {
                                //foundGalaxies.add(a);
                                System.out.println(a);
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("enter the else");
                    break;
                }
            }

            os.close();

            
            
        } catch (EOFException e){
            //System.out.println("End of file");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("Nombre del objeto: 1");
        System.out.println("Constelación: 2");
        System.out.println("Magnitud límite: 3");
        System.out.println("Salir: 4");
        
        
        int selected =sc.nextInt();
        sc.nextLine();
        
    
        if (selected == 4){
            System.out.println("exit");

        }else if (selected <= 3){
            System.out.println("In: ");
            String search = sc.nextLine();
            try {
                CallGalaxy(search,selected);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }else System.out.println("Opcion invalida");
    }
}
