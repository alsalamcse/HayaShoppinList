package com.example.user.hayashoppinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

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
        etName =(EditText) findViewById(R.id.etName);
        etAmount =(EditText) findViewById(R.id.etAmount);
        etUnits=(EditText) findViewById(R.id.etUnits);
        etPrice =(EditText) findViewById(R.id.etPrice);
        imButton =(ImageButton) findViewById(R.id. imButton);
        btSave =(Button) findViewById(R.id. btSave);




    }

    public void  dataHander()
    {
        String stName=etName.getText().toString();
        String stAmount=etAmount.getText().toString();
        String stUnits=etUnits.getText().toString();
        String stPrice=etPrice.getText().toString();
        double amount= Double.parseDouble(stAmount);
        double price= Double.parseDouble(stPrice);

    }
}
