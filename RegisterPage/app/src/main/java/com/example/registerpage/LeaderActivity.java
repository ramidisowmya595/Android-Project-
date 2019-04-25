package com.example.registerpage;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import static java.lang.Integer.*;

public class LeaderActivity extends AppCompatActivity {

    TextView BalanceAmount,TotalAmount;
    Button ShowGroup,MonthlyStatus;
    EditText edittext,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);

        edittext=findViewById(R.id.etPaid);

        TotalAmount=(TextView)findViewById(R.id.tvTotalAmount);

        MemberPay m=new MemberPay();

        BalanceAmount=(TextView)findViewById(R.id.tvRemainingAmount);
        BalanceAmount.setText(""+Compoundinterest());

        ShowGroup=findViewById(R.id.buttonShowGroup);
        MonthlyStatus=findViewById(R.id.buttonMonthlyStatus);



    }

    public void ShowGroup_Click(View view)
    {
        if(view==ShowGroup)
        {
            Intent i=new Intent(LeaderActivity.this,Member_ListActivity.class);
            startActivity(i);
        }
    }

    public void MonthlyStatus_Click(View view)
    {
        if(view==MonthlyStatus)
        {


        }
    }

    public double Compoundinterest()
    {
        double principle = 80000, rate = 2.0, time = 1;

        /* Calculate compound interest */
        double CI = principle *(Math.pow((1 + rate / 100), time));
        return CI;
    }
}
