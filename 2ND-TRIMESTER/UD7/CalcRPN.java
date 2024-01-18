// Pau Gra<3
import java.util.Stack;
import java.util.Scanner;
public class CalcRPN {
    
    public static void main(String[] args) {
        Stack<Double> numb = new Stack<Double>();
        boolean exited = false;
        Scanner sc = new Scanner(System.in);

        while (!exited){
            if (sc.hasNextDouble()){
                numb.push(sc.nextDouble());
                System.out.println("else");
            
            }else{
                String operator = sc.next();
                if (operator.equals("q")){
                    exited=true;
                    System.out.println("Exited");
                    break;
                }else if (numb.size() < 2){
                    System.out.println("Missing operators");
                    continue;
                }
                double operator2 = numb.pop();
                double operator1 = numb.pop();
                double finished;

                switch (operator) {
                    case "+":
                        finished=operator1 + operator2;
                        break;
                    case "-":
                        finished=operator1 - operator2;
                        break;
                    case "*":
                        finished=operator1 * operator2;
                        break;
                    case "/":
                        finished=operator1 / operator2;
                        break;
                    default:
                        System.out.print("Wrong input");
                        return;

                }
                numb.push(finished);
                System.out.println("="+finished);
            }
        }
    }
}