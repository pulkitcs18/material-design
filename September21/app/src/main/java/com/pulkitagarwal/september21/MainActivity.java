package com.pulkitagarwal.september21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup maritalStatus;
    private ListView namesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maritalStatus = findViewById(R.id.radioGroupMarriage);
        maritalStatus.setOnCheckedChangeListener(this);
        namesList = findViewById(R.id.namesListview);

       final ArrayList<String> names = new ArrayList<>();
        names.add("Pulkit");
        names.add("Harshit");
        names.add("Meena");
        names.add("Gopal");
        names.add("Agarwal");

        ArrayAdapter<String> namesAdapter = new ArrayAdapter<>(
          this,
          android.R.layout.simple_list_item_1,
          names
        );

        namesList.setAdapter(namesAdapter);

        namesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, names.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch(checkedId){
            case R.id.yesRadioButton:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.noRadioButton:
                Toast.makeText(MainActivity.this, "Not Married", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}