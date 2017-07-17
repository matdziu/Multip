package pl.multipexample.items;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.multipexample.R;
import pl.multipexample.lib.RecyclerItem;

public class ItemText implements RecyclerItem<ItemText.ViewHolder> {

    public static final int LAYOUT_ID = R.layout.item_text;
    private String title;

    public ItemText(String title) {
        this.title = title;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.itemTextView.setText(title);
    }

    @Override
    public int getItemViewType() {
        return LAYOUT_ID;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_text_view)
        TextView itemTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
