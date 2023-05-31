public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkarang : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());

        Segitiga s = new Segitiga(2);
        BangunDatarGeneric<Segitiga> sgtg = new BangunDatarGeneric<Segitiga>();
        sgtg.set(s);
        System.out.println("keliling segitiga : " + sgtg.hitungKeliling());
        System.out.println("tipe generic : " + sgtg.get().getClass().getName());
    }
}