package pl.multip;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public abstract class DelegateAdapter extends RecyclerView.Adapter {

    private final ViewHoldersFactory viewHoldersFactory;

    public DelegateAdapter(ViewHoldersFactory viewHoldersFactory) {
        this.viewHoldersFactory = viewHoldersFactory;
    }

    public abstract List<RecyclerItem> getRecyclerItems();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return viewHoldersFactory.create(parent, viewType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        getRecyclerItems().get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemViewType(int position) {
        return getRecyclerItems().get(position).getItemViewType();
    }

    @Override
    public int getItemCount() {
        return getRecyclerItems().size();
    }
}
