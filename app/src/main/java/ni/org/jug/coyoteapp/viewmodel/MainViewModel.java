package ni.org.jug.coyoteapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import ni.org.jug.coyoteapp.R;
import ni.org.jug.coyoteapp.model.Repository;
import ni.org.jug.coyoteapp.model.RepositoryImpl;
import ni.org.jug.coyoteapp.view.RvAdapter;

/**
 * Created by WebnMobile on 2019-09-11.
 */
public class MainViewModel extends AndroidViewModel {

    private Repository exchangeRepository = null;
    private RvAdapter recyclerAdapter = null;

    public MainViewModel(@NonNull Application application) {
        super(application);
        exchangeRepository = new RepositoryImpl( getApplication() );
        recyclerAdapter = new RvAdapter(this, R.layout.card_view);
    }

    public RvAdapter getRecyclerAdapter(){
        return recyclerAdapter;
    }
}
