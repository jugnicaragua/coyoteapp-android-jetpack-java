package ni.org.jug.coyoteapp.model;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import ni.org.jug.coyoteapp.model.database.entities.ExchangeRateEntity;
import ni.org.jug.coyoteapp.model.dto.ExchangeRateDTO;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public interface Repository {
    LiveData<List<ExchangeRateEntity>> getExchangeRateToday();
    MutableLiveData<List<ExchangeRateDTO>> getExchangeRateWeek();
    MutableLiveData<List<ExchangeRateDTO>> getExchangeRateMonth();
    MutableLiveData<List<ExchangeRateDTO>> getExchangeRateByRange(String iniDate, String endDate);
}
