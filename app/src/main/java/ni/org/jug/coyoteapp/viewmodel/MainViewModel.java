package ni.org.jug.coyoteapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import ni.org.jug.coyoteapp.model.ExchangeObservable;
import ni.org.jug.coyoteapp.view.RvAdapter;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public class MainViewModel extends AndroidViewModel {

    private ExchangeObservable exchangeObservable = new ExchangeObservable();
    private RvAdapter recyclerAdapter = null;

    public MainViewModel(@NonNull Application application) {
        super(application);
        exchangeObservable.callExchangeRateToday();
        recyclerAdapter = new RvAdapter();
    }
}
