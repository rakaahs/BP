package ganjilwhile;
import java.util.Scanner;
public class GanjilWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("  - Program Bilangan Ganjil (While) - ");
        System.out.println("  ---------------------------------------");
        System.out.print("Input bilangan n: ");
        
        int n = s.nextInt();
        int i=0;
            System.out.println("Bilangan Ganjil dari 0 Hingga "+n+" adalah ");
            while (i<= n){
                if(i%2!=0){
                    System.out.print(i+" ");
                }                
                i++;                
            }
    }
    
}
