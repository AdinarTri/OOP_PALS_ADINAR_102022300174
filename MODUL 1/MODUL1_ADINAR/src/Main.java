// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris inven = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

    

        // Todo : Create Loop list menu
        while (true) {
            System.out.println("=====Inventaris Makanan EAD=====");
            System.out.println("1. Tambah Makanan kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Exit");
            System.out.println("Pilih Menu:");
            String Choice = scanner.nextLine();
            switch (Choice) {
                case "1":
                    inven.tambahMakananKering();    
                    break;
                case "2":
                    inven.tambahMakananBasah();
                    break;
                case "3":
                    inven.tampilkanSemuaMakanan();
                    break;
                case "4":
                    System.out.println("Keluar Dari Program");
                    return;
                default:
                    System.out.println("Pilihan Tidak Valdi!!!!!!");
                    break;
            }

            
        }

    }
}
