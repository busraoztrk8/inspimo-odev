/* 0-100 ARASINDA RANDOM OLUŞTURULAN BİR DİZİDEKİ DEĞERLERİN
ORTALAMASINI BULUP BU ORTALAMANIN ÜSTÜNDE OLAN DİZİ DEĞERLERİNİ EKRANA YAZAN PROGRAMI YAZINIZ */
package ınspimo.odev1;

import java.util.Random;
import java.util.Scanner;

public class random_ortalama {
     public static void main(String[] args) {
        int toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç rastgele sayı tutulsun");

        int sayi = input.nextInt();//giriş alıyor
        int[] dizi = new int[sayi];//diziyi tanımlıyoruz

        Random rastgele = new Random();//rastgele bir sayi üretiyor
        for (int i = 0; i < sayi; i++) {
            dizi[i] = rastgele.nextInt(101);//0-100 arası sayıları rastgele atar
            System.out.print(dizi[i] + " ");
            toplam+=dizi[i];
        }


        double ortalama=(double) toplam/sayi;
        System.out.println("ortalama:"+ortalama);//ortalama üstündeki sayılar

        for (int i=0;i< dizi.length;i++){
            if (dizi[i] >ortalama) {
                System.out.println("ortalamadan büyük sayılar:"+dizi[i]);

            }

            }
        }

    
}
