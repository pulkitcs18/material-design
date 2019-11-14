package com.pulkitagarwal.fadeinfadeout;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView bart = (ImageView) findViewById(R.id.bartImageView);
        bart.animate().translationX(-1000f).setDuration(2000);

        ImageView homer = (ImageView) findViewById(R.id.homerImageView);
//        homer.animate().alpha(1f).setDuration(2000);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bartImageView);
        bart.animate().translationX(-1000f).setDuration(2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
