// Pau Gra<3
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
            
            System.out.println("1, New client came in");      //  
            System.out.println("2, Serve the next customer"); //
            System.out.println("3, Show current queue");      //
            System.out.println("0, Exit");                    //
            String answ=sc.nextLine();
            
            if (answ.equals("0")){
                exited=true;
            }else if (answ.equals("1")){
                System.out.println("Please state name of new client");
                String NewClint=sc.nextLine();
                clientes.add(NewClint);
            }else if (answ.equals("2")){
                String first = clientes.poll();
                System.out.println("Customer served: " + first);
                System.out.println("Current queue: " + clientes);
            }else if (answ.equals("3")){
                System.out.println("Show current queue:");
                Iterator<String> iterator = clientes.iterator();
                int position = 1;

                while (iterator.hasNext()) {
                    System.out.println("Client " + position + ": " + iterator.next());
                    position++;
                }
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
