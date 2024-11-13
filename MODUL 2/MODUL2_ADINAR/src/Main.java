public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer comp = new Komputer(20, "Warnet Gaming X", 5000);


        // To do: Panggillah Method Informasi dari class Komputer
        comp.informasi();
        System.out.println();
        System.out.println("=================");
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP
        KomputerVIP vip = new KomputerVIP(15, "Warnet Gaming Jokowi", 7000, false);


        // To do: Panggillah Method Informasi dari class KomputerVIP
        vip.informasi();

        // To do: Panggillah Method Login
        vip.Login("Asep");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        vip.bermain(2);
        vip.bermain(2, 3);
        System.out.println();
        System.out.println("================");
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium prem = new KomputerPremium(5, "Warnet Gaming X", 10000, false);


        // To do: Panggillah Method Informasi dari class KomputerPremium
        prem.informasi();

        // To do: Panggillah Method Pesan
        prem.pesan(5);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        prem.TambahLayanan("Mie Gacoan");
        prem.TambahLayanan("Mie Jeruk Peras", "Es Teh");
       
    }
}