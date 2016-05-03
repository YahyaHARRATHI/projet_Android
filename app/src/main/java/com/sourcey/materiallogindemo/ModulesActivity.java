package com.sourcey.materiallogindemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.ui.FirebaseListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModulesActivity extends AppCompatActivity {
    public Firebase myFirebaseRef;
    public TextView textViewNom;
    public  List<String> modules;
    public ListView listViewModules;
    FirebaseListAdapter<String> ModuleFirebaseListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        Firebase.setAndroidContext(this);

       // System.out.println(getIntent().getStringExtra("uid"));
         myFirebaseRef = new Firebase("https://luminous-heat-8924.firebaseio.com");
        String uid=getIntent().getStringExtra("uid");
        myFirebaseRef.child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //System.out.println(dataSnapshot.child("nom").getValue().toString());
                textViewNom = (TextView) findViewById(R.id.textViewNom);
                textViewNom.setTextKeepState(dataSnapshot.child("nom").getValue().toString() +
                        " " + dataSnapshot.child("prenom").getValue().toString());

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



         listViewModules = (ListView) findViewById(R.id.listView2);


         modules = new ArrayList<String>();

        modules.add("Algorithmiques");
        modules.add("BI");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,modules);
        listViewModules.setAdapter(adapter);

        listViewModules.setOnItemClickListener(mMessageClickedHandler);




    }

    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            Toast.makeText(ModulesActivity.this, "Item " + (position + 1) + ": " +
                    ((TextView) v).getText(), Toast.LENGTH_LONG).show();
            String m= (String) ((TextView) v).getText();
            System.out.println(m);
        }


    };


}
