public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        Bebas bebas = new Bebas();

        bebas.setId(1);
        bebas.setNama("Item Bebas");
        bebas.setKategori("Kategori A");
        bebas.setHarga(10000);

        bebas.tampilkanInfo();
        bebas.naikkanHarga();
        bebas.tampilkanInfo();
        bebas.naikkanHarga(2000);
        bebas.tampilkanInfo();
    }
}
