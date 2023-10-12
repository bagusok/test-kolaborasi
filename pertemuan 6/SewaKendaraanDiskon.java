package project3;
import java.util.Scanner;

public class SewaKendaraanDiskon {

    public static void main(String[] args) {
       System.out.println("===== Hitung Sewa Kendaraan =====");
         double hargaSewa = 0, total;

         Scanner sc = new Scanner(System.in);

         System.out.print("Masukkan Jenis Kendaraan (motor/mobil): ");
         String jenisKendaraan = sc.nextLine();

         System.out.print("Masukkan Lama Sewa (hari): ");
         int lamaSewa = sc.nextInt();

         if (jenisKendaraan.equalsIgnoreCase("motor")){

            if (lamaSewa > 7){
               hargaSewa = 40000;
            }else{
               hargaSewa = 50000;
            }

            total = hargaSewa * lamaSewa;
            System.out.println("Harga Total: " + total);
         }else if (jenisKendaraan.equalsIgnoreCase("mobil")){
            if (lamaSewa > 7){
               hargaSewa = 90000;
            }else{
                hargaSewa = 100000;
            }

             total = hargaSewa * lamaSewa;
             System.out.println("Harga Total: " + total);
         }else{
            System.out.println("Jenis Kendaraan Tidak Tersedia");
         }

         sc.close();

    }
    
}
