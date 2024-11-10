public class Burung extends Hewan {
    private String WarnaBulu;

    public Burung(String Nama,int Umur, String WarnaBulu){
        super(Nama, Umur);
        this.WarnaBulu = WarnaBulu;
    }
    @Override
    public void suara(){
        System.out.println(Nama + " Berkicau");
    }
    @Override
    public void InfoHewan(){
        super.InfoHewan();
        System.out.println("Warna Bulu: " + WarnaBulu);
    }
}
