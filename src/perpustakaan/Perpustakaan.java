
package perpustakaan;

import java.util.ArrayList;
import interfaces.Buku;

public class Perpustakaan {
    private ArrayList<Buku> buku = new ArrayList<>();
    
    public void tambahBuku(Buku buku){
        this.buku.add(buku);
    }
    
    public Buku cariBuku(String judul){
        for (Buku dataBuku : buku) {
            if(dataBuku.getJudul().equals(judul)){
                return dataBuku;
            }
        }
        return null;
    }
}
