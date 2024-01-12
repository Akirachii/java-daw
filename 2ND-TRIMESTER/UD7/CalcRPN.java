//Desarrolla una calculadora RPN que sume, reste, multiplique y divida.
//Debe tener niveles de pila ilimitados y creados dinámicamente en cualquier momento.
//Debe pintar la pila cada vez que cambie.
//Al introducir “q” deberá salir del programa.


import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;
public class CalcRPN {
    public static boolean exited(String entrada) {
        if (entrada == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(entrada);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {        //  Declare the main
        Stack<Integer> NumerosPila = new Stack<Integer>();
        boolean exited = false;
        Scanner sc = new Scanner(System.in);

        while (exited = false);{
            //System.out.println(NumerosPila.peek());
            if (!NumerosPila.empty()){
                System.out.println(NumerosPila.peek());     //  We print the "Pila"
                
                Integer entrada = sc.nextInt();     //  State the entry as an int

                NumerosPila.push(entrada);

            }else{
                System.out.println("The queue is empty, add numbers");
                Integer choose = sc.nextInt();
                


            }
        }
        






    }
}