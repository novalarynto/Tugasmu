public class BukuDiktat extends Buku{
    String judul, pengarang;

    public BukuDiktat(String id,String pengarang, String jud,String penerbit){
        this.idBuku = id;
        this.judul = jud;
        this.pengarang = pengarang;
        this.Penerbit = penerbit;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }
}
