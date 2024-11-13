class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.vipCard = vipCard;
    }
    
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        super.informasi();
        if(vipCard){
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon Bermain diatas 3 jam ");
            System.out.println("- Gratis Minuman min 4 jam ");
            System.out.println("- Prioritas Booking");
            System.out.println("- Bebas ");
            System.out.println("- Gratis DVD ceramah Anwar Zahid");
        }else{
            System.out.println("Benefit Member Biasa:");
            System.out.println("- Serlok Tak Parani ");
            System.out.println("- Lengah sitik Agomo ");
        }

    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("Login dengan Username: " + username);

    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam){
        System.out.println("Bermain selama "+jam+" jam");
    }

    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void bermain(int jam,int tambahan){
        System.out.println("Nambah Billing selama "+jam+" jam "+tambahan+" menit" );
    }

}