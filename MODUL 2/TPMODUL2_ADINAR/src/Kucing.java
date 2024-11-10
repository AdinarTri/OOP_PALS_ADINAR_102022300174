public class Kucing extends Hewan {
    private String Ras;

    public Kucing(String Nama,int Umur,String Ras){
        super(Nama, Umur);
        this.Ras = Ras;
    }

    @Override
    public void suara(){
        System.out.println(Nama + " mengeong");

    }
    @Override
    public void InfoHewan(){
        super.InfoHewan();
        System.out.println("Ras: " + Ras);
    }
}
