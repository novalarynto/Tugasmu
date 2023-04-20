public class Main{
    public static void main(String[] args) {
        Buku buku = new Buku();

        BukuDiktat b1 = new BukuDiktat("1678", "Pidi Baid", "Ancika", "Bandung Media");
        Majalah m1 = new Majalah("6059", "James Clear", "Atomic Habit", "12");
        Anggota a1 = new Anggota("1", "noval");
        
        a1.addBuku(b1);
        a1.addBuku(m1);
        buku.setStatusPinjam('Y');
        a1.display();
    }
}