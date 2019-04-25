package com.example.registerpage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignin;

    private FirebaseAuth firebaseAuth;

    FirebaseDatabase database;
    DatabaseReference myRef;
    ArrayList<String> al;
    //String[] array={"vamshi","bharath","shiva","sowmya","pooja","ilahini","jyoshna","divya"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth= FirebaseAuth.getInstance();

        login=(Button)findViewById(R.id.buttonRegister);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editpassword);
        textViewSignin=(TextView) findViewById(R.id.textViewSignin);
        login.setOnClickListener(this);
        textViewSignin.setOnClickListener(this);

        database= FirebaseDatabase.getInstance();
        myRef=database.getReference();
    }

    /*private void registerUser()
    {
        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Please enter email",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Please enter password",Toast.LENGTH_SHORT).show();
            return;
        }
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                           Toast.makeText(MainActivity.this,"register successfully",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"Could not register,please try again",Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }*/

    @Override
    public void onClick(View v) {
        if(v==login){
            if((editTextEmail.getText().toString().equals("sowmya"))&&(editTextPassword.getText().toString().equals("G23"))){
               // Log.d("in if","i am in if");
                Intent i=new Intent(this,LeaderActivity.class);
                startActivity(i);
            }
            if((editTextEmail.getText().toString().equals("vamshi"))&&(editTextPassword.getText().toString().equals("G20"))){
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);
            }
            else  if((editTextEmail.getText().toString().equals("bharath"))&&(editTextPassword.getText().toString().equals("G21"))){
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);
            }
            else if((editTextEmail.getText().toString().equals("pooja"))&&(editTextPassword.getText().toString().equals("G24"))) {
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);
            }
            else if((editTextEmail.getText().toString().equals("ilahini"))&&(editTextPassword.getText().toString().equals("G25"))){
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);

            }
            else if((editTextEmail.getText().toString().equals("divya"))&&(editTextPassword.getText().toString().equals("G27"))){
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);
            }
            else if((editTextEmail.getText().toString().equals("jyoshna"))&&(editTextPassword.getText().toString().equals("G26"))){
                Intent im = new Intent(this, MDetails.class);
                startActivity(im);
            }
        }
        if(v==textViewSignin){

        }

    }

}
