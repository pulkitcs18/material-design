package com.pulkitagarwal.connectfour;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){

        int activePlayer = 0;

        int[] state = {2,2,2,2,2,2,2,2,2};

        ImageView image = (ImageView) view;
        image.setTranslationY(-1000f);
        image.setImageResource(R.drawable.yellow);
        image.animate().translationYBy(1000f).rotation(360).setDuration(300);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
