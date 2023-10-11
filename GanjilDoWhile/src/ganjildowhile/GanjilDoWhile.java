package ganjildowhile;
import java.util.Scanner;
public class GanjilDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("  - Program Bilangan Ganjil (DO WHILE) - ");
        System.out.println("  ---------------------------------------");
        System.out.print("Input bilangan n: ");
        
        int n=s.nextInt();
        int i=0;
             System.out.println("Bilangan Ganjil dari 0 Hingga "+n+" adalah ");
             do{
                 if (n<=0){
                     System.out.println("Bilangan Tidak Valid");
                 }
                 if (i%2!=0){
                     System.out.print(i+" ");
                }
                 i++;
             }while (i<=n);
             System.out.println();
    }
    
}
