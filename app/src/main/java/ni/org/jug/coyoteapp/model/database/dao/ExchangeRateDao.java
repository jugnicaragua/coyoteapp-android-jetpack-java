package ni.org.jug.coyoteapp.model.database.dao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import ni.org.jug.coyoteapp.model.database.entities.ExchangeRateEntity;

/**
 * Created by WebnMobile on 2019-09-11.
 */
@Dao
public interface ExchangeRateDao {

    @Query("SELECT * FROM exchange_rate WHERE date =:today")
    MutableLiveData<ExchangeRateEntity> getExchangeRateToday(String today);

    @Query("SELECT * FROM exchange_rate WHERE date BETWEEN :iniDate AND :endDate")
    LiveData<List<ExchangeRateEntity>> loadAllByIds(String iniDate, String endDate);

}
