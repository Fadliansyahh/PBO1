public class Komik extends Buku {
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void naikkanHarga() {
        super.naikkanHarga();
        System.out.println("Harga komik naik.");
    }

    public void naikkanHarga(double kenaikan) {
        super.naikkanHarga(kenaikan);
        System.out.println("Harga komik naik sebesar " + kenaikan);
    }
}
