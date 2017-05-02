package com.androidsample.vectormorphing;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mBatView = (ImageView) findViewById(R.id.battery_view);

        final AnimatedVectorDrawable batteryAVD = (AnimatedVectorDrawable) ContextCompat.getDrawable(this, R.drawable.battery_avd);
        mBatView.setImageDrawable(batteryAVD);

        findViewById(R.id.animate_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                batteryAVD.start();
            }
        });
    }
}
