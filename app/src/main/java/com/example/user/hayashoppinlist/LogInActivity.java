package com.example.user.hayashoppinlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.hayashoppinlist.mainlistfragments.MainListActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {

    private EditText etPassword;
    private  EditText etName;
    private Button btSingup;
    private Button btSingin;
    private Button btForget;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        etPassword =(EditText) findViewById(R.id.etPassword);
        etName =(EditText) findViewById(R.id.etName);
        btSingup =(Button) findViewById(R.id.btSingup);
        btSingin =(Button) findViewById(R.id.btSingin);
        btForget =(Button) findViewById(R.id.btForget);


        btSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getBaseContext(),signup.class);
                startActivity(i);



            }
        });







    }
}
