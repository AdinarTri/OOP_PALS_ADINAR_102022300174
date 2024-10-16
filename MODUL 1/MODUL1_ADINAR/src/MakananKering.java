public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private float harga;
    private String brand;
    

    // Todo : Create Constructor of MakananBasah
    public MakananKering(String nama,int jumlah,float harga,String brand){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
        

    }

    // Todo : Create Getter and Setter
    public String getNama(){return nama;}
    public void setNama(String nama){this.nama = nama;}
    public int getJumlah(){return jumlah;}
    public void setJumlah(int jumlah){this.jumlah = jumlah;}
    public float getHarga(){return harga;}
    public void setHarga(float harga){this.harga = harga;}
    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    // Todo : Create Method ShowData
    public void ShowData(){
        System.out.println("Nama Makanan    :" + nama);
        System.out.println("Jumlah          :" + jumlah);
        System.out.println("Harga           : " + harga);
        System.out.println("Brand           :" + brand);
    }

}