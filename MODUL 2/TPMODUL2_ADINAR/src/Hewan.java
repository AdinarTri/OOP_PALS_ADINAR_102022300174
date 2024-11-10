public class Hewan {
    protected String Nama;
    protected int Umur;

    public Hewan(String Nama,int Umur){
        this.Nama = Nama;
        this.Umur = Umur;
    }
    
    public void makan(){
        System.out.println(Nama + " sedang makan ");
    }
    public void makan(String Makanan){
        System.out.println(Nama + " sedang makan " + Makanan);

    }

    public void suara(){
        System.out.println(Nama + " bersuara");
    }
    public void InfoHewan(){
        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + Umur);
    }
}
