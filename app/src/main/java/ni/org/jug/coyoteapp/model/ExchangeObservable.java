package ni.org.jug.coyoteapp.model;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import ni.org.jug.coyoteapp.model.dto.ExchangeRateDTO;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public class ExchangeObservable extends BaseObservable {

    private Repository exchangeRepository = new RepositoryImpl();

    public MutableLiveData<ExchangeRateDTO> callExchangeRateToday(){
        return exchangeRepository.getExchangeRateToday();
    }

    public MutableLiveData<List<ExchangeRateDTO>> callExchangeRateWeek(){
        return exchangeRepository.getExchangeRateWeek();
    }

    public MutableLiveData<List<ExchangeRateDTO>> callExchangeRateMonth(){
        return exchangeRepository.getExchangeRateMonth();
    }

    public MutableLiveData<List<ExchangeRateDTO>> callExchangeRateByRange(String iniDate, String endDate){
        return exchangeRepository.getExchangeRateByRange(iniDate, endDate);
    }
}
