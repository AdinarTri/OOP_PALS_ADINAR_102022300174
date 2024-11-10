public class Main {
    public static void main(String[] args) throws Exception {
        Kucing kucing = new Kucing("Momo", 2, "Persia");
        Burung burung = new Burung("Rio", 1, "Hijau");

        System.out.println("Detail Hewan :  ");
        System.out.println("Ini Adalah: " + kucing.Nama);
        kucing.suara();
        kucing.makan();
        kucing.makan("Ikan");
        System.out.println();
        System.out.println("Ini Adalah : " + burung.Nama);
        burung.suara();
        burung.makan();
        burung.makan("Biji-Bijian");
        System.out.println();
        kucing.InfoHewan();
        burung.InfoHewan();

    }
}
