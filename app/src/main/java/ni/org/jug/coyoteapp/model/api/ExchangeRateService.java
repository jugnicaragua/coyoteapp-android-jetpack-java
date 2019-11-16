package ni.org.jug.coyoteapp.model.api;

import ni.org.jug.coyoteapp.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by WebnMobile on 2019-09-19.
 */
public class ExchangeRateService {

    private static Retrofit retrofit;

    public static Retrofit getInstance(){
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BuildConfig.exchange_rate_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
