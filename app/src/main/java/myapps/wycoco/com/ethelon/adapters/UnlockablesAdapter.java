package myapps.wycoco.com.ethelon.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import myapps.wycoco.com.ethelon.R;
import myapps.wycoco.com.ethelon.models.UnlockableItems;

/**
 * Created by dell on 11/26/2016.
 */

public class UnlockablesAdapter extends ArrayAdapter<UnlockableItems>{

    private Context mContext;
    private int mResource;
    private List<UnlockableItems> mUnlockables;

    public UnlockablesAdapter(Context context, int resource, List<UnlockableItems> items) {
        super(context, resource, items);

        mContext = context;
        mResource = resource;
        mUnlockables = items;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        UnlockablesAdapter.ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
            holder = new UnlockablesAdapter.ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (UnlockablesAdapter.ViewHolder) convertView.getTag();
        }

        UnlockableItems items = mUnlockables.get(position);
        if (items != null) {
            if (holder.itemName != null) {
                holder.itemName.setText(items.getItemName());
            }
            if (holder.itemImage != null) {
                holder.itemImage.setImageResource(items.getItemImage());
            }
            if (holder.itemPrice != null) {
                holder.itemPrice.setText(items.getItemPrice());
            }
        }

        return convertView;
    }

    static class ViewHolder{
        ImageView itemImage;
        TextView itemName;
        TextView itemPrice;

        public ViewHolder(View view){
            itemImage = (ImageView) view.findViewById(R.id.itemImage);
            itemName = (TextView)view.findViewById(R.id.itemName);
            itemPrice = (TextView) view.findViewById(R.id.itemPrice);

        }

    }
}
