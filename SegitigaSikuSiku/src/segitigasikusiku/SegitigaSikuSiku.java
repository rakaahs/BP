package segitigasikusiku;
import java.util.Scanner;
public class SegitigaSikuSiku {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        
        System.out.println("    -Progam Segitiga Siku-Siku Angka-    ");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan tinggi:");
        
        int i,j; 
        int Tinggi = s.nextInt();
        System.out.println();
        
        for (i=1; i<= Tinggi; i++){
             for (j=1; j<=i; j++){
                 System.out.print(j+"");    
             }
             System.out.println();
         }

    }
    
}
