package pl.multipexample.items;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.multipexample.R;
import pl.multipexample.lib.RecyclerItem;

public class ItemButton implements RecyclerItem<ItemButton.ViewHolder> {

    public static final int LAYOUT_ID = R.layout.item_button;
    private String message;

    public ItemButton(String message) {
        this.message = message;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder) {
        viewHolder.itemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(viewHolder.context, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemViewType() {
        return LAYOUT_ID;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_button)
        Button itemButton;

        Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            context = itemView.getContext();
        }
    }
}
