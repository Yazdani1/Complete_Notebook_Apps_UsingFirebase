package yazdaniscodelab.firebaserecyleupdatedelete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class UpdateActivity extends AppCompatActivity {

    private EditText editTextTitle;
    private EditText editTextDescription;
    private Button btnupdate;
    private Button btndelete;

    private DatabaseReference databaseReference;
    private String post_key;

    private String title;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        savedata();
    }


    public void savedata(){

        editTextTitle=(EditText)findViewById(R.id.edittitle);
        editTextDescription=(EditText)findViewById(R.id.editdescription);
        btnupdate=(Button)findViewById(R.id.btnsave);
        btndelete=(Button)findViewById(R.id.btndelete);

        Intent intent=getIntent();

        title=intent.getStringExtra("title");
        description=intent.getStringExtra("description");


        post_key=intent.getStringExtra("post_key");

        databaseReference= FirebaseDatabase.getInstance().getReference().child("AllData");

        editTextTitle.setText(title);

        editTextTitle.setSelection(title.length());

        editTextDescription.setText(description);
        editTextDescription.setSelection(description.length());

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                title=editTextTitle.getText().toString().trim();
                description=editTextDescription.getText().toString().trim();
                Data data=new Data(post_key,title,description);
                databaseReference.child(post_key).setValue(data);
                Toast.makeText(getApplicationContext(),"Update Successfully..",Toast.LENGTH_LONG).show();

                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });


        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child(post_key).removeValue();
                Toast.makeText(getApplicationContext(),"Delete Successfully..",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
