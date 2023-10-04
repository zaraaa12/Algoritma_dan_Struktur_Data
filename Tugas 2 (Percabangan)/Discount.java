import java.util.Scanner;

public class Discount {
    public static void main(String[] args) throws Exception {
        Double total_Belanja, Discount;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total belanja: ");
        total_Belanja = input.nextDouble();

        if (total_Belanja >= 1000000) {
            Discount = total_Belanja * 5/100;
            total_Belanja = total_Belanja - Discount;
        
        System.out.println("Total yang harus dibayar" + total_Belanja);
        input.close();
        }

}
}