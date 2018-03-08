package com.example.user.hayashoppinlist.mainlistfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.user.hayashoppinlist.R;
import com.example.user.hayashoppinlist.data.Product;
import com.example.user.hayashoppinlist.data.ProductAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment {
private TextView tvTotalvalue, tvCont, tvCountvalue,tvTotal;
    private ImageButton imSave;
    private ListView lstvCurrent;
    private ProductAdapter productAdapter;



    public CurrentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_current, container, false);
//        tvTotal= (TextView) view.findViewById(R.id.tvTotal)   ;
//        tvTotalvalue= (TextView) view.findViewById(R.id.tvTotalValue)   ;
//        tvCountvalue= (TextView) view.findViewById(R.id.tvCountvalue)   ;
//        tvCont= (TextView) view.findViewById(R.id. tvCont)   ;
//        imSave= (ImageButton) view.findViewById(R.id.imSave)   ;
        lstvCurrent = (ListView) view.findViewById(R.id.lstvCurrent);

        //9.TODO בעיית מתאם של המוצרים
        productAdapter = new ProductAdapter(getContext(), R.layout.product_item);
        //10. TODO קביעת המתאם לרשימה
        lstvCurrent.setAdapter(productAdapter);
//
//
//        String [] ar={ "noor","Haya","samih","teya"};
//        //ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,)
        readAndListListen();
        return view;
    }

        // Reas and listen data from firebase
        private void readAndListListen()
    {

        // 5.to get user email ...user info
        FirebaseAuth auth =FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email = user .getEmail();
        email=email.replace('.','*');


        //6. bulding data reference = data path=data address
        DatabaseReference reference;
        // todo לקבלת קישור ללמסד
        //
        reference = FirebaseDatabase.getInstance().getReference();
        //7. Listening to data change
        reference.child(email).child(" myList").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                productAdapter.clear();
                for (DataSnapshot ds: dataSnapshot .getChildren() )
                {
                   Product p = ds.getValue (Product.class);
                    Log.d ("SL",p.toString());
                    productAdapter.add(p);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
