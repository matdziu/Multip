package pl.multipexample;

import java.util.List;

import pl.multipexample.lib.DelegateAdapter;
import pl.multipexample.lib.RecyclerItem;
import pl.multipexample.lib.RecyclerItemsFactory;

public class MainAdapter extends DelegateAdapter {

    private List<RecyclerItem> dataSet;

    MainAdapter(RecyclerItemsFactory recyclerItemsFactory, List<RecyclerItem> dataSet) {
        super(recyclerItemsFactory);
        this.dataSet = dataSet;
    }

    @Override
    public List<RecyclerItem> getDataSet() {
        return dataSet;
    }
}
