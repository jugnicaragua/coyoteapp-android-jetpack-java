package ni.org.jug.coyoteapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import ni.org.jug.coyoteapp.BR;
import ni.org.jug.coyoteapp.R;
import ni.org.jug.coyoteapp.viewmodel.MainViewModel;

/**
 * Created by Lauren Steven on 2019-09-07.
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ExchangeRateHolder>{

    public RvAdapter(MainViewModel viewModel, int resource) {
    }

    @NonNull
    @Override
    public ExchangeRateHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.card_view, parent, false);
        //return new ExchangeRateHolder(binding);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExchangeRateHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ExchangeRateHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding = null;

        public ExchangeRateHolder(@NonNull View itemView) {
            //this.binding = binding;
            super(itemView);
        }

        public void bindView(MainViewModel viewModel, int position){

        }

    }
}
