public class Bebas {
    private int id;
    private String nama;
    private String kategori;
    private double harga;

    public Bebas() {
        System.out.println("Object Bebas telah diciptakan, constructor berjalan");
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Kategori: " + this.kategori);
        System.out.println("Harga: " + this.harga);
    }

    public void naikkanHarga() {
        this.harga += 500; 
    }

    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
    }
}
