package com.example.monabrivelo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.myLayout = (LinearLayout) findViewById(R.id.myDynamicLayout);

        ImageView image = new ImageView (this);
        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(100, 100);
        image.setLayoutParams(params);
        image.setBackgroundResource(R.drawable.bullerecharge);
        myLayout.addView(image);





    }
}
