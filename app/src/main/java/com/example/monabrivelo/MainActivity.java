package com.example.monabrivelo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.play = (ImageView) findViewById(R.id.bouton_emplacement_libre);
        this.play = (ImageView) findViewById(R.id.bouton_recharge);
        this.play = (ImageView) findViewById(R.id.bouton_abonnement);
        this.play = (ImageView) findViewById(R.id.bouton_aide);
        this.play = (ImageView) findViewById(R.id.bouton_compte);
        this.play = (ImageView) findViewById(R.id.bouton_gps);
        this.play = (ImageView) findViewById(R.id.bouton_itineraire);
        this.play = (ImageView) findViewById(R.id.bouton_meteo);
        this.play = (ImageView) findViewById(R.id.bouton_reserve);
    }
}
