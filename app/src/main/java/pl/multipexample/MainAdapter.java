package pl.multipexample;

import java.util.List;

import pl.multipexample.lib.DelegateAdapter;
import pl.multipexample.lib.RecyclerItem;

public class MainAdapter extends DelegateAdapter {

    private List<RecyclerItem> dataSet;

    public MainAdapter(List<RecyclerItem> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public List<RecyclerItem> getDataSet() {
        return dataSet;
    }
}
