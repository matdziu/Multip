package pl.multipexample.lib;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;

public interface RecyclerItem<T extends RecyclerView.ViewHolder> {

    void onBindViewHolder(T viewHolder);

    @LayoutRes
    int getItemViewType();
}
