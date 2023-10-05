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
               hargaSewa = 50000 - (50000 * 0.05);
            }else{
               hargaSewa = 50000;
            }

            total = hargaSewa * lamaSewa;
            System.out.println("Harga Total: " + total);
         }else if (jenisKendaraan.equalsIgnoreCase("mobil")){
            if (lamaSewa > 7){
               hargaSewa = 100000 - (100000 * 0.1);
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
