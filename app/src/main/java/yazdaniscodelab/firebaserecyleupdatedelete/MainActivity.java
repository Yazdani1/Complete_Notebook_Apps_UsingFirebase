package yazdaniscodelab.firebaserecyleupdatedelete;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.firebase.client.collection.LLRBNode;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_plus;

    private RecyclerView recyclerView;
    private DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openInsertMethod();




        databaseReference= FirebaseDatabase.getInstance().getReference().child("AllData");
        databaseReference.keepSynced(true);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerData);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
    }


    @Override
    protected void onStart() {
        super.onStart();



        FirebaseRecyclerAdapter<Data,MainActivity.AlldataViewholder>recyclerAdapter=new FirebaseRecyclerAdapter<Data, MainActivity.AlldataViewholder>
                (
                        Data.class,
                        R.layout.item_data,
                        MainActivity.AlldataViewholder.class,
                        databaseReference
                ) {
            @Override
            protected void populateViewHolder(AlldataViewholder viewHolder, final Data model, int position) {

                final String post_key=getRef(position).getKey();

                viewHolder.setTitle(model.getTitle());
                viewHolder.setDescription(model.getDescription());


                viewHolder.mview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent=new Intent(getApplicationContext(),UpdateActivity.class);

                        intent.putExtra("post_key",post_key);
                        intent.putExtra("title",model.getTitle());
                        intent.putExtra("description",model.getDescription());
                        startActivity(intent);

                        //Toast.makeText(getApplicationContext(),post_key,Toast.LENGTH_LONG).show();
                    }
                });

            }
        };
        recyclerView.setAdapter(recyclerAdapter);
    }



    public static class AlldataViewholder extends RecyclerView.ViewHolder {

        View mview;
        ImageView imageoftitle;

        public AlldataViewholder(View itemView) {
            super(itemView);
            mview=itemView;
        }

        public void setTitle(String title){
            TextView mtitle=(TextView)mview.findViewById(R.id.texttitle);
            mtitle.setText(title);
        }

        public void setDescription(String description){
            TextView mdescription=(TextView)mview.findViewById(R.id.textdecriptio);
            mdescription.setText(description);
        }



    }


    public void openInsertMethod(){
        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus_xml);
        fab_plus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),InsertDataActivity.class));
            }
        });
    }


}
