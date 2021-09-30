package com.pulkitagarwal.materiadesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button btnShowSnackBar;
    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.conParent);

        btnShowSnackBar = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "this is a cardview" , Toast.LENGTH_SHORT).show();
            }
        });
        btnShowSnackBar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                showSnackBar();
            }
        });
    }

    private void showSnackBar(){
        Snackbar.make(parent, "This is a SnackBar", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Retry Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.design_default_color_primary))
                .show();
    }
}