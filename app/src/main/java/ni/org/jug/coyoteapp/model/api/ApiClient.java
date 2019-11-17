package ni.org.jug.coyoteapp.model.api;

import ni.org.jug.coyoteapp.model.dto.ExchangeRateDTO;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by WebnMobile on 2019-09-19.
 */
public interface ApiClient {

    @GET("/exchange_today")
    Call<ExchangeRateDTO> getExchangeToday();



}
