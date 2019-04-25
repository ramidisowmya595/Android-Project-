package com.example.registerpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MDetails extends AppCompatActivity {
    TextView textView,tvamount;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdetails);
        textView=findViewById(R.id.textView2);
        tvamount=findViewById(R.id.tvramount);
        button=findViewById(R.id.button2);

        tvamount.setText("");
    }


    public void Amounttopaid_Click(View view) {
        if(view==button) {
            Intent i = new Intent(this, MemberPay.class);
            startActivity(i);
        }
    }
}
