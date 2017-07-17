package pl.multipexample.lib;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public interface RecyclerItemsFactory {

    RecyclerView.ViewHolder create(ViewGroup parent, int viewType);
}
