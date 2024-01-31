import java.util.Scanner;

public class Fraccion {
    public int Numerador;
    public int denominador;

    public Fraccion(){
        this.Numerador=1;
        this.denominador=2;
    }

    public void invertir(int Numerador, int denominador){
        int temporal=this.Numerador;
        this.Numerador=denominador;
        this.denominador=temporal;
    }

    // getters
    public int getNumerador() {
        return this.Numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraccion fracion = new Fraccion();
        boolean bool=false;
        while (!bool){
            System.out.println("---------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Invertir");
            System.out.println("2. Simplificar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("---------------------------");
            System.out.print("Que haces?: ");
            String answ = sc.nextLine();
            switch (answ) {
                case "1": //Invertir
                    System.out.println("Fracción original: " + Fraccion.getNumerador() + "/" + Fraccion.getDenominador());
                    Fraccion.invertir();
                    System.out.println("Fracción invertida: " + Fraccion.getNumerador() + "/" + Fraccion.getDenominador());
                    break;
                case "2": //Simplificar
                    //
                    break;
                case "3": //Multiplicar
                    //
                    break;
                case "4": //Dividir
                    //
                    break;
                case "5": //Salir
                    //
                    bool=true;
                    break;
                default:
                    break;
            }
            
           
        }
    }




}
