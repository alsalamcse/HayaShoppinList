package com.example.user.hayashoppinlist;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.user.hayashoppinlist.data.Product;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddItem extends AppCompatActivity {

    private EditText etName;
    private EditText etAmount;
    private EditText etUnits;
    private EditText etPrice;
    private ImageButton imButton;
    private Button btSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);
        etName = (EditText) findViewById(R.id.etName);
        etAmount = (EditText) findViewById(R.id.etAmount);
        etUnits = (EditText) findViewById(R.id.etUnits);
        etPrice = (EditText) findViewById(R.id.etPrice);
        imButton = (ImageButton) findViewById(R.id.imButton);
        btSave = (Button) findViewById(R.id.btSave);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHander();
            }
        });


    }

    public void dataHander() {
        //1. get data from the fiels
        String stName = etName.getText().toString();
        String stAmount = etAmount.getText().toString();
        String stUnits = etUnits.getText().toString();
        String stPrice = etPrice.getText().toString();
        //2. todo Valiad fields input
        //isok= true;

        // data manipulation
        double amount = Double.parseDouble(stAmount);
        double price = Double.parseDouble(stPrice);
        //4. building data object
        Product p =new Product ();
        p.setName(stName);
        p.setAmount(amount);
        p.setPrice(price);
        p.setCompleted(false);



        // 5.to get user email ...user info
        FirebaseAuth auth =FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email = user .getEmail();
        email=email.replace('.','*');


         //6. bulding data reference = data path=data address
        DatabaseReference reference;
        //
        reference = FirebaseDatabase.getInstance().getReference();
        reference.child(email).child(" myList"). push() .setValue(p).
                // to completeListrner to check if the insertion is done
                addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(AddItem.this, "Add product Faild", Toast.LENGTH_LONG);

                        }
                    }

                });






        //reference.child("list").setValue("koko");

    }
}
