package edu.gvsu.cis.deadvastation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import edu.gvsu.cis.deadvastation.ItemsFragment.OnListFragmentInteractionListener;
import edu.gvsu.cis.deadvastation.dummy.ShopContent.ShopItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link ShopItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private final List<ShopItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    public ItemsAdapter(List<ShopItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mShopItemName.setText(holder.mItem.itemName);
        holder.mShopPrice.setText(holder.mItem.itemPrice.toString());
        if (holder.mItem.itemNumber == 0) {
            // pistol icon
            holder.mImage.setImageDrawable(holder.mImage.getResources().getDrawable(R.drawable.ic_handgun));
        } else if (holder.mItem.itemNumber == 1) {
            // rifle icon
            holder.mImage.setImageDrawable(holder.mImage.getResources().getDrawable(R.drawable.ic_automatic_weapon));
        } else if (holder.mItem.itemNumber == 2) {
            // sniper icon
            holder.mImage.setImageDrawable(holder.mImage.getResources().getDrawable(R.drawable.ic_sniper_rifle));
        }
        // add more images here as more choices added to game

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mShopItemName;
        public final TextView mShopPrice;
        public final ImageView mImage;
        public ShopItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mShopItemName = (TextView) view.findViewById(R.id.shopItemName);
            mShopPrice = (TextView) view.findViewById(R.id.shopPrice);
            mImage = (ImageView) view.findViewById(R.id.imageRV);
        }

//        @Override
//        public String toString() {
//            return super.toString() + " '" + mDateTime.getText() + "'";
//        }
    }


}
