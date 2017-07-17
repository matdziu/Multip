package pl.multipexample.lib;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public abstract class DelegateAdapter extends RecyclerView.Adapter {

    private final RecyclerItemsFactory recyclerItemsFactory;

    public DelegateAdapter(RecyclerItemsFactory recyclerItemsFactory) {
        this.recyclerItemsFactory = recyclerItemsFactory;
    }

    public abstract List<RecyclerItem> getDataSet();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return recyclerItemsFactory.create(parent, viewType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        getDataSet().get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemViewType(int position) {
        return getDataSet().get(position).getItemViewType();
    }

    @Override
    public int getItemCount() {
        return getDataSet().size();
    }
}
