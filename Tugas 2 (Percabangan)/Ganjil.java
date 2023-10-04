import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka:" );
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.print("Bilangan Ganjil");
            input.close();
        }
}
}