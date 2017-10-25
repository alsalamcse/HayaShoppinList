package com.example.user.hayashoppinlist;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity implements View.OnClickListener  {
    private EditText etName;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etRepassword;
    private Button btSave;
    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etRepassword = (EditText) findViewById(R.id.etRepassword);
        btSave = (Button) findViewById(R.id.btSave);
        btSave.setOnClickListener(this);
        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();


    }
private  void  dataHander()
{
 String stEmail=etEmail.getText().toString();
  String stName=etName.getText().toString();
  String stpassword=etPassword.getText().toString();
  String stRePassword=etRepassword.getText().toString();
  boolean isok=true;//to check if all failds are filler
 if(stEmail.length()==0||stEmail.indexOf('@')<1){
     etEmail.setError("Wrong Email");
     isok=false;
 }
if (isok)
  creatAcount(stEmail,stpassword);

}
    public void creatAcount(String email, String passwprd) {// theeeeee  Sing up
        auth.createUserWithEmailAndPassword(email, passwprd).addOnCompleteListener(signup.this,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(signup.this, "Authentication Successful", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(signup.this, "Authentication failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();





                }
            }

        });


    }


    @Override
    public void onClick(View view) {

     if(btSave==view){
         dataHander();
        }
    }
}
