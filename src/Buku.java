import java.util.Scanner;

public class Buku {
    String idBuku,Penerbit;
    private char statusPinjam;
    Scanner inp = new Scanner(System.in);

    public String getIdBuku() {
        return this.idBuku;
    }

    public String getPenerbit() {
        return this.Penerbit;
    }

    public boolean setStatusPinjam(char status) {
        this.statusPinjam = status;
        if(this.statusPinjam == 'Y' || this.statusPinjam == 'N'){}
        return true;
    }

    public boolean getStatusPinjam() {
        return setStatusPinjam(statusPinjam);
    }
}
