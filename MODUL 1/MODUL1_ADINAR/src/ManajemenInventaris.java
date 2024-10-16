// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;
public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    private ArrayList <MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList <MakananBasah> daftarMakananBasah = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.println("Masukkan Nama Makanan       :");
        String nama = input.nextLine();
        System.out.println("Masukkan Jumlah Makanan     :");
        int jumlah = input.nextInt();
        System.out.println("Masukkan Harga Makanan      :");
        float harga = input.nextFloat();
        input.nextLine();
        System.out.println("Masukkan Brand Makanan      :");
        String brand = input.nextLine();


        // Todo : Create a new object for MakananKering

        MakananKering tambah = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(tambah);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan Berhasil Ditambahkan");
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.println("Masukkan Nama Makanan       :");
        String nama = input.nextLine();
        System.out.println("Masukkan Jumlah Makanan     :");
        int jumlah = input.nextInt();
        System.out.println("Masukkan Harga Makanan      :");
        float harga = input.nextFloat();
        input.nextLine();
        System.out.println("Masukkan Bahan Makanan      :");
        String bahan = input.nextLine();


        // Todo : Create a new object for MakananBasah
        MakananBasah tambah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(tambah);
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Berhasil Ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty()&&daftarMakananBasah.isEmpty()){
            System.out.println("Tidak Ada Makanan Disini!!!");
        }else{
            System.out.println("========Daftar Makanan========");
            System.out.println("====List Makanan Kering====");

            for (MakananKering  makanan: daftarMakananKering){
                System.out.println("========================");
                makanan.ShowData();
            }

            System.out.println("====List Makanan Basah====");

            for (MakananBasah makanan : daftarMakananBasah){
                System.out.println("========================");
                makanan.ShowData();
            }


        }
    }
}
