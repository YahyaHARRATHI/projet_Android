package com.sourcey.materiallogindemo;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

import java.util.ArrayList;
import java.util.List;

public class listMatiereActivity extends AppCompatActivity {
    public Firebase myFirebaseRef;
public String uid;
    public String module;
    public TextView text3;
    public TextView text4;
    public FirebaseListAdapter<Matiere> matiereFirebaseListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_matiere);

       //get data from fireBase
        Firebase.setAndroidContext(this);
        uid=getIntent().getStringExtra("uid");
         module=getIntent().getStringExtra("module");
        myFirebaseRef = new Firebase("https://luminous-heat-8924.firebaseio.com/"+uid+"/modules/"+module+"/matieres");


        final ListView listView=(ListView) findViewById(R.id.listView);

        matiereFirebaseListAdapter=new FirebaseListAdapter<Matiere>(this,Matiere.class,
                android.R.layout.two_line_list_item,myFirebaseRef) {
            @Override
            protected void populateView(View view, Matiere mat, int i) {
                ((TextView)view.findViewById(android.R.id.text1)).setText(mat.getLibelle()+"          Ds : " + mat.getDs() +
                        "             tp : " + mat.getTp());
                ((TextView)view.findViewById(android.R.id.text2)).setText("                        examen : "+mat.getExamen()+ "          Moyenne : " +mat.getMoyenneMatiere());
            }
        };

        listView.setAdapter(matiereFirebaseListAdapter);


    }
}
