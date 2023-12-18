import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* KULLANICI TARAFINDAN BOYUTLARI GİRİLEN MATRİKSİN ELEMANLARINI 0-100 ARASINDA
     RASTGELE OLUŞTURUN SONRASINDA BU MATRİKSİ SIRALAYIN*/
        Scanner klavye=new Scanner(System.in);
        Random rand=new Random();

       /* Matriksin boyutları alınıyor*/

        System.out.println("Dizinin satır sayısını girin");
        int satir= klavye.nextInt();
        System.out.println("Dizinin sütun sayısını girin");
        int sutun= klavye.nextInt();
        int[][]matriks=new int[satir][sutun];


        /* Matriksin elemanları rastgele atanıp matriks yazdırılıyor */

        System.out.println("Matriks yazdırılıyor");
       for (int i=0;i<matriks.length;i++){
           for (int j=0;j<matriks[i].length;j++){
               matriks[i][j]=rand.nextInt(0,100);
               System.out.print(matriks[i][j]+" ");
           }
           System.out.println();
       }

       /* Matriks tek boyutlu bir diziye çevriliyor ve tek boyutlu dizi yazdırılıyor */

        System.out.println("Tek boytlu diziye çevriliyor");
        int index=0;
        int[]dizi=new int[satir*sutun];
        for (int i=0;i<matriks.length;i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                dizi[index] = matriks[i][j];
                System.out.print(dizi[index]+" ");
                index++;
            }
        }
        System.out.println();
        System.out.println();

        /* Tek boyutlu dizi deki elemanlar büyükten küçüğe sıralanıyor */

        System.out.println("Elemanlar büyükten küçüğe sıralanıyor");
        for (int i=0;i<satir*sutun-1;i++) {
            for (int j =i+1; j < satir*sutun; j++) {
                if (dizi[j] > dizi[i]) {
                     int temp=dizi[i] ;
                     dizi[i] = dizi[j];
                     dizi[j] = temp;
                }
            }
        }

        /* Sıralanan dizi yazdırılıyor */

       System.out.println("Sıralı dizi yazdırılıyor");
        for (int yazi:dizi){
            System.out.print(yazi+" ");
        }
        System.out.println();
        System.out.println();

   /* Sıralanan dizi yeniden matrikse aktarılıyor ve matriks yazdırılıyor */

        index=0;
        System.out.println("Sıralanan dizi yeniden matrikse aktarılıyor");
   for (int i=0;i< matriks.length;i++){
       for (int j=0;j<matriks[i].length;j++){
           matriks[i][j]=dizi[index];
           System.out.print(matriks[i][j]+" ");
           index++;
       }
       System.out.println();
   }


    }
}