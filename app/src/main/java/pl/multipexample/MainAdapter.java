package pl.multipexample;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter {

    private List<RecyclerItem> dataSet;

    public MainAdapter(List<RecyclerItem> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getItemViewType(int position) {
        return dataSet.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ItemsFactory.onCreateViewHolder(parent, viewType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        dataSet.get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
