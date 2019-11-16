package ni.org.jug.coyoteapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import ni.org.jug.coyoteapp.model.api.ApiClient;
import ni.org.jug.coyoteapp.model.api.ExchangeRateService;
import ni.org.jug.coyoteapp.model.database.AppDatabase;
import ni.org.jug.coyoteapp.model.database.dao.ExchangeRateDao;
import ni.org.jug.coyoteapp.model.database.entities.ExchangeRateEntity;
import ni.org.jug.coyoteapp.model.dto.ExchangeRateDTO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public class RepositoryImpl implements Repository {

    private ExchangeRateDao exchangeRateDao;
    private MutableLiveData<ExchangeRateEntity> exchangeRateToday;

    public RepositoryImpl(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        exchangeRateDao = db.exchangeRateDao();
        exchangeRateToday = exchangeRateDao.getExchangeRateToday("");

    }

    @Override
    public MutableLiveData<ExchangeRateEntity> getExchangeRateToday() {
        exchangeRateToday = exchangeRateDao.getExchangeRateToday("2019-09-19");

        if (exchangeRateToday == null){
            getCurrentExchangeRateFromAPI();
        }


        return exchangeRateToday;
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

    private void getCurrentExchangeRateFromAPI(){
        ApiClient service = ExchangeRateService.getInstance().create(ApiClient.class);
        Call<ExchangeRateDTO> call = service.getExchangeToday();
        call.enqueue(new Callback<ExchangeRateDTO>() {

            @Override
            public void onResponse(Call<ExchangeRateDTO> call, Response<ExchangeRateDTO> response) {

            }

            @Override
            public void onFailure(Call<ExchangeRateDTO> call, Throwable t) {

            }
        });
    }
}
