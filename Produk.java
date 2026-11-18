public class Produk<T, U> {
    private final T nama;
    private final U harga;
    private final Integer stok;
    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama; this.harga = harga; this.stok = stok;
    }
    public T getNama() { return nama; }
    public U getHarga() { return harga; }
    public Integer getStok() { return stok; }
    @Override public String toString() { return nama + "," + harga + "," + stok; }
}
