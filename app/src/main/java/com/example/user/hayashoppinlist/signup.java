package com.example.user.hayashoppinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {
    private EditText etName;
    private  EditText etEmail;
    private  EditText etPassword;
    private  EditText  etRepassword;
    private Button btSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etName =(EditText) findViewById(R.id.etName);
        etEmail =(EditText) findViewById(R.id.etEmail);
        etPassword =(EditText) findViewById(R.id.etPassword);
        etRepassword = (EditText) findViewById(R.id.etRepassword);
        btSave =(Button) findViewById(R.id.btSave);



    }
}
