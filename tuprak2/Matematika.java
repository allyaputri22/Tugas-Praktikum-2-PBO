package tuprak2;

public class Matematika implements InterfaceMatematika {
    int angka1, angka2;
    int jumlah, kurang, kali, bagi;

    public void pertambahan(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPenjumlahan();
    }

    public void pengurangan(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPengurangan();
    }

    public void perkalian(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPerkalian();
    }

    public void pembagian(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPembagian();
    }

    public void info() {
        System.out.println("Hasil penjumlahan  20 + 10 : " + jumlah);
        System.out.println("Hasil pengurangan  10 - 5  : " + kurang);
        System.out.println("Hasil perkalian    10 * 3  : " + kali);
        System.out.println("Hasil pembagian    21 / 2  : " + bagi);
    }

    void hitungPenjumlahan() {
        jumlah = angka1 + angka2;
    }

    void hitungPengurangan() {
        kurang = angka1 - angka2;
    }

    void hitungPerkalian() {
        kali = angka1 * angka2;
    }

    void hitungPembagian() {
        if (angka2 != 0) {
            bagi = angka1 / angka2; 
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            bagi = 0;
        }
    }
}
