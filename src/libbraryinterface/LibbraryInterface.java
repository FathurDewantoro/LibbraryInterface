package libbraryinterface;

import perpustakaan.Perpustakaan;
import perpustakaan.Novel;
import perpustakaan.BukuAnak;
import perpustakaan.Sains;
import interfaces.Buku;

public class LibbraryInterface {

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        //tambah buku
        perpustakaan.tambahBuku(new Novel("Harry Poter", "J.K Rowling"));
        perpustakaan.tambahBuku(new BukuAnak("Dora", "Vicki Cobb"));
        perpustakaan.tambahBuku(new Sains("IPA", "Fathur"));
        
        //cari buku
        Buku buku = perpustakaan.cariBuku("IPA");
        
        if (buku != null) {
            System.out.println("Judul : "+buku.getJudul());
            System.out.println("Pengarang : "+buku.getPengarang());
            System.out.println("Jenis : "+buku.getJenis());
        }else{
            System.out.println("Buku tidak ditemukan");
        }
        
    }
    
}
