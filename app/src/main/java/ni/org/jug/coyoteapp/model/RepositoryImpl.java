package ni.org.jug.coyoteapp.model;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import ni.org.jug.coyoteapp.model.database.AppDatabase;
import ni.org.jug.coyoteapp.model.database.dao.ExchangeRateDao;
import ni.org.jug.coyoteapp.model.database.entities.ExchangeRateEntity;
import ni.org.jug.coyoteapp.model.dto.ExchangeRateDTO;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public class RepositoryImpl implements Repository {

    private ExchangeRateDao exchangeRateDao;
    private LiveData<ExchangeRateEntity> exchangeRateToday;

    RepositoryImpl(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        exchangeRateDao = db.exchangeRateDao();
        exchangeRateToday = exchangeRateDao.getExchangeRateToday("");

    }

    @Override
    public MutableLiveData<ExchangeRateDTO> getExchangeRateToday() {
        return null;
    }

    @Override
    public MutableLiveData<List<ExchangeRateDTO>> getExchangeRateWeek() {
        return null;
    }

    @Override
    public MutableLiveData<List<ExchangeRateDTO>> getExchangeRateMonth() {
        return null;
    }

    @Override
    public MutableLiveData<List<ExchangeRateDTO>> getExchangeRateByRange(String iniDate, String endDate) {
        return null;
    }
}
