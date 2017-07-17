package pl.multipexample.items;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.multipexample.R;
import pl.multipexample.RecyclerItem;

public class ItemPicture implements RecyclerItem<ItemPicture.ViewHolder> {

    public static final int LAYOUT_ID = R.layout.item_picture;
    private int imageRes;

    public ItemPicture(@DrawableRes int imageRes) {
        this.imageRes = imageRes;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.itemImageView.setImageResource(imageRes);
    }

    @Override
    public int getItemViewType() {
        return LAYOUT_ID;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_image_view)
        ImageView itemImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
