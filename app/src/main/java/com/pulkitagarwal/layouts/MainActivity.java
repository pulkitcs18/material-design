package com.pulkitagarwal.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void display(View view){
        switch (view.getId()){
            case R.id.yesButton:
                Toast.makeText(MainActivity.this, "You got it man", Toast.LENGTH_SHORT).show();
                break;
            case R.id.noButton:
                Toast.makeText(MainActivity.this, "Boo, you suck!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
