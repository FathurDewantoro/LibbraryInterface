package perpustakaan;

import interfaces.Buku;

public class Novel implements Buku {
    private String judul;
    private String pengarang;
    
    //constructor
    public Novel(String judul, String pengarang){
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
        return "Novel";
    }

}
