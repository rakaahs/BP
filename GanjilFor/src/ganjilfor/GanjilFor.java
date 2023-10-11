package ganjilfor;
import java.util.Scanner;
public class GanjilFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("  - Program Bilangan Ganjil (FOR) - ");
        System.out.println("  ---------------------------------------");
        System.out.print("Input bilangan n: ");
             int n = s.nextInt();
            System.out.println("Bilangan Ganjil dari 0 Hingga "+n+" adalah ");
            
            for (int i=1; i<=n; i++){   
                if (i%2!=0){
                    System.out.print(i+" ");
                }
              
            }
            System.out.println();
    }
    
}
