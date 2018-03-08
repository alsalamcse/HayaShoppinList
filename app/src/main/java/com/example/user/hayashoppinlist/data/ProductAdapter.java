package com.example.user.hayashoppinlist.data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.hayashoppinlist.R;

/**
 * Created by user on 14/12/2017.
 */

public class ProductAdapter extends ArrayAdapter<Product>

{


    public ProductAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);

        /**
         * todo מספר סידורי של הנתון (עצם)
         */
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.product_item,parent,false);

        TextView itTvName=(TextView)view.findViewById(R.id.itTvName);
        TextView itTvPrice=(TextView) view.findViewById(R.id.itTvPrice);
        TextView itTvAmount=(TextView) view.findViewById(R.id.itTvAmount);
        ImageView imageButton =(ImageView) view.findViewById(R.id.imageButton);
        CheckBox itemCompleted=(CheckBox) view.findViewById(R.id.itemCompleted);
        Product p=getItem(position);
        itTvName.setText(p.getName());
        itTvPrice.setText(p.getPrice()+"");
        itTvAmount.setText(p.getAmount()+"");
        itemCompleted.setChecked(p.isCompleted());


         return view;



    }
}
