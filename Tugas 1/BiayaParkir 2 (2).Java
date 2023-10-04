import java.util.Scanner;
public class Parkir {
     public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Jam Masuk: 7 ");
            int jamMasuk = input.nextInt();

            System.out.print("Jam Keluar: 12 ");
            int jamKeluar = input.nextInt();

            System.out.print("Biaya Parkir per Jam: 2000 ");
            int biayaParkir = input.nextInt();

            int lamaParkir = jamKeluar - jamMasuk;
            int totalBiaya = lamaParkir * biayaParkir;

            System.out.println("Lama Parkir: " + lamaParkir + "jam" );
            System.out.println("Total Biaya: Rp.10.000" + totalBiaya);
        }
    }
}