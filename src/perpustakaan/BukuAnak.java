package perpustakaan;

import interfaces.Buku;

public class BukuAnak implements Buku {
    private String judul;
    private String pengarang;
    
    //constructor
    public BukuAnak(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getJenis(){
        return "Buku Anak";
    }
}
