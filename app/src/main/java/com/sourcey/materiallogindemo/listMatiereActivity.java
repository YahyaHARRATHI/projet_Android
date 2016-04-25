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

public class listMatiereActivity extends ListActivity {
    public Firebase myFirebaseRef;
    public TextView text3;
    public TextView text4;
    public FirebaseListAdapter<Matiere> matiereFirebaseListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_matiere);

       //get data from fireBase
        Firebase.setAndroidContext(this);
        myFirebaseRef = new Firebase("https://luminous-heat-8924.firebaseio.com/");




        /*
        listView.setAdapter(matiereFirebaseListAdapter);


        // creta our layout s
        final List<Matiere> matList=new ArrayList<>();

        class IconicAdapter extends ArrayAdapter<Matiere> {
            Activity context;
            IconicAdapter(Activity context) {
                super(context, R.layout.ma_ligne, matList);
                this.context = context;
            }
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = context.getLayoutInflater();
                View ligne = inflater.inflate(R.layout.ma_ligne, null);
                TextView nomMatiere = (TextView) ligne.findViewById(R.id.nomMatiere);
                TextView DsNote = (TextView) ligne.findViewById(R.id.DsNote);
                TextView TpNote = (TextView) ligne.findViewById(R.id.TpNote);
                TextView ExamenNote = (TextView) ligne.findViewById(R.id.ExamenNote);
                TextView Moyenne = (TextView) ligne.findViewById(R.id.Moyenne);

                label.setText(items.get(position));

                return ligne;
            }
        }


        final ListView listView=(ListView) findViewById(R.id.listView);
        matiereFirebaseListAdapter=new FirebaseListAdapter<Matiere>(this,Matiere.class,
                new IconicAdapter(this),myFirebaseRef) {
            @Override
            protected void populateView(View view, Matiere matiere, int i) {
                ((TextView)view.findViewById(android.R.id.text1)).setText(Double.toString(matiere.getTp()));
                ((TextView)view.findViewById(android.R.id.text2)).setText(Double.toString(matiere.getDs()));

            }
        };
*/
    }
}
