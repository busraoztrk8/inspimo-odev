
package ınspimo.odev1;

import java.util.Scanner;

public class carpmakullanmadan_carpma {

    public static void main(String[] args) {
                 Scanner input=new Scanner(System.in);
        int sayi1,sayi2 ,sonuc=0;
        System.out.println("1.sayıyı giriniz:");
        sayi1=input.nextInt();
        System.out.println("ikinci sayıyı gir:");
        sayi2=input.nextInt();


        for(int i=0;i<sayi2;i++){

            sonuc+=sayi1;

        }
        System.out.println("iki sayının çarpımı:"+sonuc);
    }
    }
    

