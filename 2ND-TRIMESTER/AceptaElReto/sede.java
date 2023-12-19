import java.util.Scanner;
public class sede{
    
    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        
    
        int resultado[]=new int[7];
        int casos;
        int suma=0;

        casos = sc.nextInt();

        for (int x=0;x<casos;x++){
            //int total = sc.nextInt();
            for (int i = 0; i < 7; i++){
                resultado[i]=sc.nextInt();
                //total -= sc.nextInt();
            }
            for (int i = 1; i < 7; i++){
                resultado[0]=resultado[0]-resultado[i];
                //total -= sc.nextInt();
            }

        System.out.println(resultado[0]);
        }
    }
}