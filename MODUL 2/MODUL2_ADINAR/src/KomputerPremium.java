class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan
    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        super.informasi();
        if(ruangPrivat){
            System.out.println("Fasilitas Ruangan Premium:");
            System.out.println("- Ruangan ber-AC pribadi ");
            System.out.println("- Kursi Gaming ");
            System.out.println("- Spek Komputer Tinggi");
            System.out.println("- Internet Up-to 1000 Gbps");
        }else{
            System.out.println("Fasilitas Ruangan Standar:");
            System.out.println("- Kipas CVT Gredek ");
            System.out.println("- Kursi Majapahit Ade Rohimat ");
            System.out.println("- Spek Komputer Intel Celeron");
            System.out.println("- Internet Up-to 10 Mbps");
            System.out.println("- Bonus Kak Gem");
        }
    } 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Memesan Komputer No :" + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String Makanan){
        System.out.println("Menambah Layanan Makanan: " +Makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String Makanan,String Minuman){
        System.out.println("Menambah Layanan Makanan: " +Makanan+" dan Minuman: " +Minuman);
    }
    
}
