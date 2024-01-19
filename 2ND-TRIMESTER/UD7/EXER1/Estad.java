package EXER1;
// Pau Gra<3
import java.util.ArrayList;
import java.util.Scanner;

public class Estad  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbs = new ArrayList<Double>();
        boolean exited=false;
        double add=0;
        double number=0;
        int size=0;

        while (!exited){
            String in = sc.nextLine();

            if (in.equals("q")) {
                System.out.println("Exited");
                exited=true;
                
            }else{
                number = Double.parseDouble(in);
                numbs.add(number);
                add += number;
                size = numbs.size();
                double media = add / size;
                ArrayList<Double> deviation = new ArrayList<Double>();


                double resta = 0;
                double elevar = 0;
                double sumar2 = 0;
                for (int i = 0 ; i < numbs.size(); i++){

                    resta = numbs.get(i) - media;
                    elevar = resta * resta;
                    deviation.add(elevar);
                    sumar2 += elevar;   
    
                }
    
                double media2 = sumar2 / size;
                double desviacion = Math.sqrt(media2);
    
            System.out.println(in + " = " + media + " desviación tipica poblacional " + deviation );

            }
        }
    } 
}