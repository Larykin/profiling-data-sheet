package com.example.larykin.profilingdatasheet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    MySQLiteHelper db = new MySQLiteHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner hand_spinner = (Spinner) findViewById(R.id.handedness);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> hand_adapter = ArrayAdapter.createFromResource(this,
                R.array.handedness_array, android.R.layout.simple_spinner_item);
        // Apply the adapter to the spinner
        hand_spinner.setAdapter(hand_adapter);

        final Spinner breath_spinner = (Spinner) findViewById(R.id.breathing);
        ArrayAdapter<CharSequence> breath_adapter = ArrayAdapter.createFromResource(this,
                R.array.breathing_array, android.R.layout.simple_spinner_item);
        breath_spinner.setAdapter(breath_adapter);

        final Spinner ght_hand_spinner = (Spinner) findViewById(R.id.ght_hand);
        ArrayAdapter<CharSequence> ght_hand_adapter = ArrayAdapter.createFromResource(this,
                R.array.ght_hand_array, android.R.layout.simple_spinner_item);
        ght_hand_spinner.setAdapter(ght_hand_adapter);

        final Spinner ght_association_spinner = (Spinner) findViewById(R.id.ght_association);
        ArrayAdapter<CharSequence> ght_association_adapter = ArrayAdapter.createFromResource(this,
                R.array.ght_association_array, android.R.layout.simple_spinner_item);
        ght_association_spinner.setAdapter(ght_association_adapter);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText location_et = (EditText) findViewById(R.id.location);
                String location = location_et.getText().toString();
                EditText proxemics_et = (EditText) findViewById(R.id.proxemics);
                String proxemics = proxemics_et.getText().toString();
                EditText date_et = (EditText) findViewById(R.id.date);
                String date = date_et.getText().toString();
                EditText weather_et = (EditText) findViewById(R.id.weather);
                String weather = weather_et.getText().toString();
                EditText temp_et = (EditText) findViewById(R.id.temp);
                String temp = temp_et.getText().toString();
                ToggleButton gender_tb = (ToggleButton) findViewById(R.id.gender);
                boolean gender = gender_tb.isChecked();
                EditText height_et = (EditText) findViewById(R.id.height);
                String height = height_et.getText().toString();
                EditText weight_et = (EditText) findViewById(R.id.weight);
                String weight = weight_et.getText().toString();
                Spinner handedness_et = (Spinner) findViewById(R.id.handedness);
                //handedness.setOnItemSelectedListener(this);
                int handedness = handedness_et.getSelectedItemPosition();
                Spinner breathing_et = (Spinner) findViewById(R.id.breathing);
                int breathing = breathing_et.getSelectedItemPosition();
                EditText presence_et = (EditText) findViewById(R.id.presence);
                String presence = presence_et.getText().toString();
                EditText posture_et = (EditText) findViewById(R.id.posture);
                String posture = posture_et.getText().toString();
                EditText shoes_et = (EditText) findViewById(R.id.shoes);
                String shoes = shoes_et.getText().toString();
                EditText colors_et = (EditText) findViewById(R.id.colors);
                String colors = colors_et.getText().toString();
                EditText breathrate_et = (EditText) findViewById(R.id.breathrate);
                String breathrate = breathrate_et.getText().toString();
                EditText blinkrate_et = (EditText) findViewById(R.id.blinkrate);
                String blinkrate = blinkrate_et.getText().toString();
                EditText shutterspd_et = (EditText) findViewById(R.id.shutterspd);
                String shutterspd = shutterspd_et.getText().toString();
                EditText hygiene_et = (EditText) findViewById(R.id.hygiene);
                String hygiene = hygiene_et.getText().toString();
                EditText description_et = (EditText) findViewById(R.id.description);
                String description = description_et.getText().toString();
                EditText initges_et = (EditText) findViewById(R.id.initges);
                String initges = initges_et.getText().toString();
                EditText interges_et = (EditText) findViewById(R.id.interges);
                String interges = interges_et.getText().toString();
                ToggleButton appreciation_tb = (ToggleButton) findViewById(R.id.appreciation);
                boolean appreciation = appreciation_tb.isChecked();
                ToggleButton acceptance_tb = (ToggleButton) findViewById(R.id.acceptance);
                boolean acceptance = acceptance_tb.isChecked();
                ToggleButton approval_tb = (ToggleButton) findViewById(R.id.approval);
                boolean approval = approval_tb.isChecked();
                ToggleButton intelligence_tb = (ToggleButton) findViewById(R.id.intelligence);
                boolean intelligence = intelligence_tb.isChecked();
                ToggleButton pity_tb = (ToggleButton) findViewById(R.id.pity);
                boolean pity = pity_tb.isChecked();
                ToggleButton admiration_tb = (ToggleButton) findViewById(R.id.admiration);
                boolean admiration = admiration_tb.isChecked();
                ToggleButton power_tb = (ToggleButton) findViewById(R.id.power);
                boolean power = power_tb.isChecked();
                EditText weaknesses_et = (EditText) findViewById(R.id.weaknesses);
                String weaknesses = weaknesses_et.getText().toString();
                EditText dislikes_et = (EditText) findViewById(R.id.dislikes);
                String dislikes = dislikes_et.getText().toString();
                EditText pronouns_et = (EditText) findViewById(R.id.pronouns);
                String pronouns = pronouns_et.getText().toString();
                EditText adjectives_et = (EditText) findViewById(R.id.adjectives);
                String adjectives = adjectives_et.getText().toString();
                Spinner ght_hand_et = (Spinner) findViewById(R.id.ght_hand);
                int ght_hand = ght_hand_et.getSelectedItemPosition();
                Spinner ght_association_et = (Spinner) findViewById(R.id.ght_association);
                int ght_association = ght_association_et.getSelectedItemPosition();
                EditText inter2ges_et = (EditText) findViewById(R.id.inter2ges);
                String inter2ges = inter2ges_et.getText().toString();
                EditText phrases_et = (EditText) findViewById(R.id.phrases);
                String phrases = phrases_et.getText().toString();
                EditText tolookup_et = (EditText) findViewById(R.id.tolookup);
                String tolookup = tolookup_et.getText().toString();
                EditText sketch_et = (EditText) findViewById(R.id.sketch);
                String sketch = sketch_et.getText().toString();
                EditText notes_et = (EditText) findViewById(R.id.notes);
                String notes = notes_et.getText().toString();

                db.addPerson(new Person(location, proxemics, date, weather, temp, gender, height,
                        weight, handedness, breathing, presence, posture, shoes, colors, breathrate,
                        blinkrate, shutterspd, hygiene, description, initges, interges,
                        appreciation, acceptance, approval, intelligence, pity, admiration, power,
                        weaknesses, dislikes, pronouns, adjectives, ght_hand, ght_association,
                        inter2ges, phrases, tolookup, sketch, notes));

                clearForm((ViewGroup) findViewById(R.id.content_main));
                hand_spinner.setSelection(0);
                breath_spinner.setSelection(0);
                ght_hand_spinner.setSelection(0);
                ght_association_spinner.setSelection(0);
                gender_tb.setChecked(false);
                appreciation_tb.setChecked(false);
                acceptance_tb.setChecked(false);
                approval_tb.setChecked(false);
                intelligence_tb.setChecked(false);
                pity_tb.setChecked(false);
                admiration_tb.setChecked(false);
                power_tb.setChecked(false);

            }
        });

    }

    private MenuItem mSpinnerItem1 = null;

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.


        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.menu_main, menu);
        mSpinnerItem1 = menu.findItem( R.id.profiles_spinner);
        View view1 = mSpinnerItem1.getActionView();
        if (view1 instanceof Spinner)
        {
            final Spinner profiles_spinner = (Spinner) view1;
            ArrayAdapter<CharSequence> id_select_adapter = ArrayAdapter.createFromResource(this,
                    R.array.id_select_array, android.R.layout.simple_spinner_item);
            profiles_spinner.setAdapter(id_select_adapter);


            profiles_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    int pos = profiles_spinner.getSelectedItemPosition();
                    //person = db.getPerson(pos);

                    TextView location = (TextView) findViewById(R.id.location);
                    String location_val = db.getPerson(pos).getLocation();
                    location.setText(location_val);
                    // TODO Other variables??
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                    // TODO Auto-generated method stub

                }
            });

        }

        return true;
    }
    */

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem item = menu.findItem(R.id.profiles_spinner);
        Spinner profiles_spinner = (Spinner) MenuItemCompat.getActionView(item);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.id_select_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        profiles_spinner.setAdapter(adapter);
        return true;

        profiles_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    */

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //Top menu
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */

    private void clearForm(ViewGroup group) {
        for (int i = 0, count = group.getChildCount(); i < count; ++i) {
            View view = group.getChildAt(i);
            if (view instanceof EditText) {
                ((EditText) view).setText("");
            }

            if (view instanceof ViewGroup && (((ViewGroup) view).getChildCount() > 0))
                clearForm((ViewGroup) view);
        }
    }

}