package pl.multipexample;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.multipexample.items.ItemButton;
import pl.multipexample.items.ItemPicture;
import pl.multipexample.items.ItemText;

public class ItemsFactory {

    @SuppressLint("DefaultLocale")
    public static RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(viewType, parent, false);

        switch (viewType) {
            case ItemButton.LAYOUT_ID:
                return new ItemButton.ViewHolder(itemView);
            case ItemText.LAYOUT_ID:
                return new ItemText.ViewHolder(itemView);
            case ItemPicture.LAYOUT_ID:
                return new ItemPicture.ViewHolder(itemView);
        }
        throw new IllegalArgumentException(String.format("Unregistered item type detected! [%d]", viewType));
    }
}
