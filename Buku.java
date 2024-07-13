public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    public void naikkanHarga() {
        this.harga += 1000;  // Misalkan kenaikan default 1000
    }
    
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
    }
    

    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    public Buku(int id, String judul, String penulis, int jumlah_halaman, double harga) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah_halaman = jumlah_halaman;
        this.harga = harga;
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlahHalaman() {
        return this.jumlah_halaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
