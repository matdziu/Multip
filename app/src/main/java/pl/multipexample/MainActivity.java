package pl.multipexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.multipexample.items.ItemButton;
import pl.multipexample.items.ItemPicture;
import pl.multipexample.items.ItemText;
import pl.multipexample.lib.RecyclerItem;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private List<RecyclerItem> dataSet = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        populate(dataSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(dataSet));
    }

    void populate(List<RecyclerItem> dataSet) {
        dataSet.add(new ItemText("This is a text item"));
        dataSet.add(new ItemButton("Thanks for clicking"));
        dataSet.add(new ItemPicture(R.drawable.penguin));
        dataSet.add(new ItemText("This is a text item"));
        dataSet.add(new ItemButton("Thanks for clicking"));
        dataSet.add(new ItemPicture(R.drawable.penguin));
        dataSet.add(new ItemText("This is a text item"));
        dataSet.add(new ItemButton("Thanks for clicking"));
        dataSet.add(new ItemPicture(R.drawable.penguin));
        dataSet.add(new ItemText("This is a text item"));
        dataSet.add(new ItemButton("Thanks for clicking"));
        dataSet.add(new ItemPicture(R.drawable.penguin));
        dataSet.add(new ItemText("This is a text item"));
        dataSet.add(new ItemButton("Thanks for clicking"));
        dataSet.add(new ItemPicture(R.drawable.penguin));
    }
}
