package pollub.ism.lab08;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Transakcje {
    @Insert
    public void insert(HistoriaTransakcji historiaTransakcji);

    @Update

    void update(HistoriaTransakcji historiaTransakcji);

    @Query("SELECT transakcja_id, data, stara_ilosc, nowa_ilosc, nazwa_produktu FROM HistoriaTransakcji WHERE nazwa_produktu= :wybraneWarzywoNazwa")
    List<HistoriaTransakcji> selectAllUpdates (String wybraneWarzywoNazwa);


    @Query("SELECT COUNT(*) FROM HistoriaTransakcji")
    int size();
}
