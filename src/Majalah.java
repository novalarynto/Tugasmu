public class Majalah extends Buku{
    String namaMajalah, edisi;

    public Majalah(String idbuku, String pener, String majalah, String edi){
        this.idBuku = idbuku;
        this.Penerbit = pener;
        this.namaMajalah = majalah;
        this.edisi = edi;
    }

    public String getNamaMajalah() {
        return namaMajalah;
    }

    public String getEdisi() {
        return edisi;
    }
}
