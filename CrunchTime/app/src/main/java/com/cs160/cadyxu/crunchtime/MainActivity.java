package com.cs160.cadyxu.crunchtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    EditText result;
    Spinner beforeSpinner;
    Spinner afterSpinner;
    ArrayAdapter<CharSequence> adapter;
    String beforeUnit;
    String afterUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spinner = (Spinner) findViewById(R.id.beforeSpinner);

        input = (EditText) findViewById(R.id.inputEditText);
        beforeSpinner = (Spinner)findViewById(R.id.beforeSpinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.units,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        beforeSpinner.setAdapter(adapter);

        afterSpinner = (Spinner) findViewById(R.id.afterSpinner);
        afterSpinner.setAdapter(adapter);

        beforeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                beforeUnit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        afterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                afterUnit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void convert(View v){
        double value = new Double (input.getText().toString());
        value = unitConverter.exerciseConvert(value, beforeUnit, afterUnit);
        result.setText(new Double(value).toString());

    }






}
