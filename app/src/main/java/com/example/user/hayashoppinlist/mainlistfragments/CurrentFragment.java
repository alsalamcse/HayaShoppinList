package com.example.user.hayashoppinlist.mainlistfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.user.hayashoppinlist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment {
private TextView tvTotalvalue, tvCont, tvCountvalue,tvTotal;
    private ImageButton imSave;
    private ListView lstvCurrent;



    public CurrentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_current, container, false);
        tvTotal= (TextView) view.findViewById(R.id.tvTotal)   ;
        tvTotalvalue= (TextView) view.findViewById(R.id.tvTotalValue)   ;
        tvCountvalue= (TextView) view.findViewById(R.id.tvCountvalue)   ;
        tvCont= (TextView) view.findViewById(R.id. tvCont)   ;
        imSave= (ImageButton) view.findViewById(R.id.imSave)   ;
        lstvCurrent= (ListView) view.findViewById(R.id.lstvCurrent)   ;


        String [] ar={ "noor","Haya","samih","teya"};
        //ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,)

        return view;
    }

}
