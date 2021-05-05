package pollub.ism.lab08;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "HistoriaTransakcji")
public class HistoriaTransakcji {
    @PrimaryKey(autoGenerate = true)
    public int transakcja_id;
    public String data;
    public int stara_ilosc;
    public int nowa_ilosc;
    public String nazwa_produktu;

    public HistoriaTransakcji(String data, int stara_ilosc, int nowa_ilosc, String nazwa_produktu) {
        this.data = data;
        this.stara_ilosc = stara_ilosc;
        this.nowa_ilosc = nowa_ilosc;
        this.nazwa_produktu = nazwa_produktu;
    }
}
