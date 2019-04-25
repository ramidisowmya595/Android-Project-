package com.example.registerpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MemberPay extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button button;
    int flag=0;
    String str;

    FirebaseDatabase fbdb;
    DatabaseReference dataRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_pay);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);

        str=editText2.getText().toString();

        dataRef=FirebaseDatabase.getInstance().getReference();

    }
    public void pay_Click(View view)
        {
            Members m=new Members(editText1.getText().toString(),Integer.parseInt(editText2.getText().toString()));
            status();
            dataRef.child("memberpaydetails").setValue(m);

        }
    public void status(){
        if(editText1.getText().toString().equals("G20")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G21")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G22")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G23")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G24")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G25")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G26")){
            flag=1;
        }
        else if(editText1.getText().toString().equals("G27")){
            flag=1;
        }
    }

}
