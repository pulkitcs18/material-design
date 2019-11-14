package com.pulkitagarwal.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int num;
    public void matchNumber(View view) {

        EditText numberinput = (EditText) findViewById(R.id.numberInput);

        int numberGuessed = Integer.parseInt(numberinput.getText().toString());
        System.out.println(numberGuessed);
        System.out.println(num);
            if (numberGuessed > num) {
                Toast.makeText(MainActivity.this, "Too high, Try again!", Toast.LENGTH_SHORT).show();
            } else if (numberGuessed < num) {
                Toast.makeText(MainActivity.this, "Too low, Try again", Toast.LENGTH_SHORT).show();
            } else if (numberGuessed == num) {
                Toast.makeText(MainActivity.this, "Awesome, NEW GAME", Toast.LENGTH_SHORT).show();
                Random rand = new Random();
                num = rand.nextInt(20);
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        num = rand.nextInt(20);
    }
}
