import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        double GajiBulanan = input.nextDouble();
        double GajiTahunan = GajiBulanan * 12;
        double tax = 0;
        if (GajiTahunan <= 500000) {
            tax = 0;
        } else if (GajiTahunan <= 1000000) {
            tax = 0.05 * (GajiTahunan - 500000);
        } else if (GajiTahunan <= 2000000) {
            tax = 12.500 + 0.2 * (GajiTahunan - 1000000);
        } else {
            tax = 112.500 + 0.3 * (GajiTahunan - 10000000);
        }
        System.out.print("Pajak penghasilan tahunan yang harus dibayar adalah: " +tax);
        input.close();
}
}

