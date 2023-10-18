package tuprak2;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        
        matematika.pertambahan(20, 10);
        matematika.pengurangan(10, 5);
        matematika.perkalian(10, 3);
        matematika.pembagian(21, 2);

        // Menampilkan hasil operasi matematika
        matematika.info();
    }
}
