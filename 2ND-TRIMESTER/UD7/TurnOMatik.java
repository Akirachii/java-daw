import java.util.Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TurnOMatik {
    public static void main(String[] args) {        //  Declare the main section
        boolean exited=false;
        Scanner sc = new Scanner(System.in);
        Queue<String> clientes = new LinkedList<String>();

        while (!exited){
            
            System.out.println("1, Nuevo cliente ha entrado");     //  
            System.out.println("2, Atender al siguiente cliente"); //
            System.out.println("3, Mostrar cola actual");          //
            System.out.println("0, Salir");                        //
            String answ=sc.nextLine();
            
            if (answ.equals("0")){
                exited=true;
            }else if (answ.equals("1")){
                System.out.println("Please state name of new client");
                String NewClint=sc.nextLine();
                clientes.add(NewClint);
            }else if (answ.equals("2")){
                String first = clientes.poll();
                System.out.println("Cliente atendido: " + first);
                System.out.println("Cola actual: " + clientes);
            }else if (answ.equals("3")){
                System.out.println("Mostrar cola actual:");
                Iterator<String> iterator = clientes.iterator();
                int position = 1;

                while (iterator.hasNext()) {
                    System.out.println("Cliente " + position + ": " + iterator.next());
                    position++;
                }
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
