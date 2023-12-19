import java.util.Scanner;

public class Ejer1 {
    public static void main (String[] args){
        int dim;
        int cont;
        char antes;
        String lines;
        Scanner sc = new Scanner(System.in);


        dim = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<dim;i++){
            lines=sc.newLine();
            System.out.print(line.charAt(0));

            cont=0;
            antes=line.charAt(0);
            for (int x=1;x<dim;x++){
                if (line.charAt(x)==antes) cont++;
                else{
                    System.out.print(" "+cont);
                    cont=1;
                    antes=line.charAt[x];
                }
            }
        System.out.print(" "+cont);
        }
    }
}