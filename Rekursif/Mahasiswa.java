public class Mahasiswa {
    static String[] mahasiswa = {"nisa", "nelsa", "zaraa"};
    public static void main(String[] args) {
        getMahasiswa(0);
    }

    static void getMahasiswa(Integer absensi) {
        if (absensi < mahasiswa.length) {
            System.out.println("Absensi No-" + absensi + " Bernama : " + mahasiswa[absensi]);
            getMahasiswa(absensi + 1);
        }
    }
}
