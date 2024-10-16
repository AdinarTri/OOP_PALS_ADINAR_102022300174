import java.util.Scanner;
import java.util.ArrayList;


public class tpmodul1 {
    private static ArrayList<flightSchedule> schedules = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        schedules.add(new flightSchedule("GA101", "CGK, Jakarta", "DPS, Bali", "06.45", "09.50", 1200000));
        schedules.add(new flightSchedule("QZ202", "SOC, Solo", "Heathrow, London", "12.00", "00.20", 7300000));
        
        while (true) {
            Menu();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    displaySchedule();
                    break;
                case 2:
                    buyingTicket();
                    break;
                case 3:
                    displayTicket();
                    break;
                case 4:
                    System.out.println("Terima kasih!!!!!");
                    return;
                default:
                    System.out.println("Pilihan Tidak Valdi");
                    break;
            }
            
        }

    }

    private static void displaySchedule(){
        System.out.println("===== Daftar Penerbangan ====");
        for (int i = 0; i < schedules.size(); i++){
            System.out.println((i+1)+".");{
                schedules.get(i).dispayflightSchedule();
            }
        }

    }

    public static flightSchedule bought;
    public static passenger register;

    private static void buyingTicket(){
        System.out.println("Silahkan Isi Data Diri");
        input.nextLine();
        System.out.println("NIK: ");
        String NIK = input.nextLine();
        System.out.println("Nama Depan: ");
        String firstName = input.nextLine();
        System.out.println("Nama Belakang: ");
        String lastName = input.nextLine();

        register = new passenger(NIK, firstName, lastName);
        System.out.println("Silahkan Pilih Jadwal");
        displaySchedule();
        System.out.println("Pilih Nomor Penerbangan: ");
        int choice = input.nextInt();
        bought = schedules.get(choice -1);
        System.out.println("Pemesanan tiket berhasil!!! Silahkan mengecek di menu Tampilkan Pesanan");


    }

    private static void displayTicket(){
        if (bought == null){
            System.out.println("Tidak Ada Tiket yang Dipesan!!");
        } else {
            System.out.println("===== Detail Tiket Penerbangan");
            register.displayPassenger();
            bought.dispayflightSchedule();
        }
    }



    private static void Menu(){
        System.out.println("====== EAD Booking Ticket System ====== ");
        System.out.println("1. Tampilkan Daftar Penerbangan");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Tampilkan Pesanan Tiket");
        System.out.println("4. Exit");
        System.out.println("Silahkan Pilih Menu");
    }
    

    
}

class passenger{
    private String NIK;
    private String firstName;
    private String lastName;

    public passenger(String NIK,String firstName,String lastName) {
        this.NIK = NIK;
        this.firstName =firstName;
        this.lastName = lastName;
    }
    public void displayPassenger(){
        System.out.println("NIK           : " + NIK);
        System.out.println("Nama Depan    : " + firstName);
        System.out.println("Nama Belakang : " + lastName);

    }
}

class flightSchedule{
    private String flightNumber;
    private String departure;
    private String Arrival;
    private String takeOff;
    private String landing;
    private float price;

    public flightSchedule(String flightNumber,
    String departure,
    String Arrival,
    String takeOff,
    String landing,
    float price){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.Arrival = Arrival;
        this.takeOff = takeOff;
        this.landing = landing;
        this.price = price;

    }
    
    public String getflightNumber(){
        return flightNumber;
    }

    public String getdeparture(){
        return departure;
    }
    
    public String getArrival(){
        return Arrival;
    }

    public String gettakeOff(){
        return takeOff;
    }

    public String getlanding(){
        return landing;
    }

    public float getprice(){
        return price;
    }

    public void dispayflightSchedule(){
        System.out.println("Nomor Penerbangan: " + flightNumber);
        System.out.println("Bandara Keberangkatan:" + departure + "  Tujuan: "+Arrival);
        System.out.println("Waktu Keberangkatan: " + takeOff+"  Waktu Kedatangan: "+ landing);
        System.out.println("Harga Tiket Pesawat: Rp"+price);
        System.out.println();

    }

    



}