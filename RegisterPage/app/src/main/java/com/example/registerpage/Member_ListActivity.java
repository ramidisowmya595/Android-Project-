package com.example.registerpage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Member_ListActivity extends AppCompatActivity {

    //FirebaseDatabase fdb;
    private DatabaseReference databaseReference;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member__list);
        //fdb = FirebaseDatabase.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("/Group2/members");

        recyclerView=findViewById(R.id.recyclicview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(Member_ListActivity.this));

        FirebaseRecyclerAdapter<Members,BlogViewHolder> adapter=new FirebaseRecyclerAdapter<Members, BlogViewHolder>(
                Members.class,R.layout.user_info,BlogViewHolder.class,databaseReference
        ) {
            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, Members model, int position) {
                viewHolder.setName(model.getMembername().toString());
                viewHolder.setId(model.getMemberid().toString());
            }
        };

        recyclerView.setAdapter(adapter);
    }
    public  static class BlogViewHolder extends RecyclerView.ViewHolder{
        TextView name,id,bal;

        public BlogViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.membername1);
            id=itemView.findViewById(R.id.memberid1);
        }

        public void setName(String memname) {
            name.setText(memname);
        }

        public void setId(String memid) {
            id.setText(memid);
        }
    }
}


