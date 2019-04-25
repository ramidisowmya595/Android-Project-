package com.example.registerpage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class UserList extends ArrayAdapter<Members> {
    private Activity context=null;
    ArrayList<Members> algroup;

    public UserList(Activity context, List<Members> algroup) {
        super(context, R.layout.activity_member__list,algroup);
        this.context=context;
        this.algroup= (ArrayList<Members>) algroup;
    }

   /* public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewitem=inflater.inflate(R.layout.activity_member__list,null,true);

        TextView membername=listViewitem.findViewById(R.id.tvMname);
        TextView memberid=listViewitem.findViewById(R.id.tvMid);
        TextView mbalance=listViewitem.findViewById(R.id.tvPaidStatus);

        Members m=algroup.get(position);
        membername.setText(m.getMembername());
        memberid.setText(m.getMemberid());
        return listViewitem;
    }*/
}
