package com.example.user.hayashoppinlist;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.hayashoppinlist.mainlistfragments.MainListActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etPassword;
    private  EditText etEmail;
    private Button btSingup;
    private Button btSingin;
    private Button btForget;
    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        etPassword = (EditText) findViewById(R.id.etPassword);
        etEmail = (EditText) findViewById(R.id.etEmail);
        btSingup = (Button) findViewById(R.id.btSingup);
        btSingin = (Button) findViewById(R.id.btSingin);
        btForget = (Button) findViewById(R.id.btForget);
        btSingin.setOnClickListener(this);
         auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();


    }
    public void datahander(){
        String stEmail=etEmail.getText().toString();
        String stPassword=etPassword.getText().toString();



    private void signIn(String email, String passw) {
        auth.signInWithEmailAndPassword(email,passw).addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(LogInActivity.this, "signIn Successful.", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LogInActivity.this,.class);
                    startActivity(intent);
                    finish();


                }
        }) {

        }
                }












        btSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getBaseContext(),signup.class);
                startActivity(i);



            }
        });







    }
}
