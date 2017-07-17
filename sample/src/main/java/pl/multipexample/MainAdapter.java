package pl.multipexample;

import java.util.List;

import pl.multip.DelegateAdapter;
import pl.multip.RecyclerItem;
import pl.multip.ViewHoldersFactory;


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
