package pl.multipexample;

import java.util.List;

import pl.multipexample.lib.DelegateAdapter;
import pl.multipexample.lib.RecyclerItem;
import pl.multipexample.lib.ViewHoldersFactory;

public class MainAdapter extends DelegateAdapter {

    private List<RecyclerItem> dataSet;

    MainAdapter(ViewHoldersFactory viewHoldersFactory, List<RecyclerItem> dataSet) {
        super(viewHoldersFactory);
        this.dataSet = dataSet;
    }

    @Override
    public List<RecyclerItem> getRecyclerItems() {
        return dataSet;
    }
}
