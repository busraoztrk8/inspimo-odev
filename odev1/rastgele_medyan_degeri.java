// RASTGELE VERİLEN BİR DİZİDEKİ MEDYAN DEĞERİNİ DÖNDÜREN KODU YAZINIZ.
package ınspimo.odev1;

import java.util.Random;

public class rastgele_medyan_degeri {
     public static void main(String[] args) {
        Random rnd=new Random();//rastgele bir sayı üretiyor
        int[] dizi=new int[5];
           for(int i=0;i<dizi.length-1;i++){
             dizi[i]=rnd.nextInt(5);
   }
        System.out.println(java.util.Arrays.toString(dizi));
          java.util.Arrays.sort(dizi);//rastgele seçtiği sayılardan oluşturduğu diziyi küçükten büyüğe doğru sıralar
        System.out.println(java.util.Arrays.toString(dizi));
        if(dizi[2]%2==0){
            System.out.println("Medyan:"+dizi[2]);
        }
        else {
            System.out.println("Medyan:"+dizi[2]);
        }



    }
}
    

