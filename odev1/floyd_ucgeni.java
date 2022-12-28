package ınspimo.odev1;
// FLOYD ÜÇGENİNİ EKRANA ÇİZDİREN JAVA KODUNU
import java.util.Scanner;

public class floyd_ucgeni {
    public static void main(String[] args) {
      int sayma=1;
        Scanner input=new Scanner(System.in);
        System.out.print("POWS:");
        int sayi=input.nextInt();


        for(int i=1;i<=sayi;i++){//girilen sayı kadar döndürmesini ayarlıyor
            for (int j=1;j<=i;j++){
                System.out.print(sayma+" ");
                sayma++;
            }
            System.out.println();
        }  
    }
     
    
}
