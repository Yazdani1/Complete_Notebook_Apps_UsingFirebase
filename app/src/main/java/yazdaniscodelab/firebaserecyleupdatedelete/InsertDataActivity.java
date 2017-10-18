package yazdaniscodelab.firebaserecyleupdatedelete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertDataActivity extends AppCompatActivity {

    private EditText editTextTitle;
    private EditText editTextDescription;
    private Button btnsave;

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        savedata();
    }

    public void savedata(){

        editTextTitle=(EditText)findViewById(R.id.edittitle);
        editTextDescription=(EditText)findViewById(R.id.editdescription);
        btnsave=(Button)findViewById(R.id.btnsave);
        databaseReference= FirebaseDatabase.getInstance().getReference().child("AllData");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploaddata();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }


    public void uploaddata(){

        String title=editTextTitle.getText().toString().trim();
        String description=editTextDescription.getText().toString().trim();

        if (TextUtils.isEmpty(title)){
            editTextTitle.setError("Title required.");
            return;
        }

        if (TextUtils.isEmpty(description)){
            editTextDescription.setError("Description required.");
            return;
        }

        editTextTitle.setText("");
        editTextDescription.setText("");


//        DatabaseReference nedreference=databaseReference.push();
//
//        nedreference.child("title").setValue(title);
//        nedreference.child("description").setValue(description);


        String id=databaseReference.push().getKey();
        Data data=new Data(id,title,description);
        databaseReference.child(id).setValue(data);
        Toast.makeText(getApplicationContext(),"Insert Successfully..",Toast.LENGTH_LONG).show();

    }







}
