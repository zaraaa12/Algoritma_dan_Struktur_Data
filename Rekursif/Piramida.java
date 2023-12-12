public class Piramida {
    public static void main(String[] args) {
        int b = 0;
        System.out.println("input jumlah baris :");
        cetakPiramida(0);
}
static void cetakPiramida(int i) {
    cetakSpasi(0, i);
    cetakBintang(b , i);
    System.out.println();
    i++;
    if (i < b){
        cetakPiramida(i);
    }
}
static void cetakSpasi(int j, int i) {
    if (j<b-i-1){
        System.out.println(" ");
        cetakSpasi(j+i,i);
    }
}
}
