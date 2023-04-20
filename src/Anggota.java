import java.util.ArrayList;

public class Anggota{
    String idAngota,namaAnggota;
    Buku bu = new Buku();
    ArrayList<Buku> listbuku = new ArrayList<>();

    public Anggota(String id, String nama){
        this.idAngota = id;
        this.namaAnggota = nama;
    }

    public void addBuku(Buku buku) {
        listbuku.add(buku);
    }

    private void garis(){
        System.out.println(" ========================= ");
    }

    public void display() {
        garis();
        System.out.println("Status Pinjam : " + bu.getStatusPinjam() );
        System.out.println("ID Anggota: " + idAngota);
        System.out.println("Nama Anggota: " + namaAnggota);
        garis();
        System.out.println("\nDengan Buku yang dipinjam : ");
        garis();
        for (Buku buku : listbuku) {
            if (buku instanceof BukuDiktat) {
                BukuDiktat bukuDiktat = (BukuDiktat) buku;
                System.out.println("Buku Diktat");
                System.out.println("ID Buku : " + bukuDiktat.getIdBuku());
                System.out.println("Pengarang : " + bukuDiktat.getPengarang());
                System.out.println("Judul Buku : " + bukuDiktat.getJudul());
                System.out.println("Penerbit : " + bukuDiktat.getPenerbit());
                garis();
            } else if (buku instanceof Majalah) {
                Majalah majalah = (Majalah) buku;
                System.out.println("Majalah");
                System.out.println("ID Buku: " + majalah.getIdBuku());
                System.out.println("Penerbit : " + majalah.getPenerbit());
                System.out.println("Nama Majalah : " + majalah.getNamaMajalah());
                System.out.println("Edisi : " + majalah.getEdisi());
                garis();
            }
        }
        
    }
    
}
