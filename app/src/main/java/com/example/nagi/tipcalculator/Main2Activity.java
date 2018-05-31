package com.example.nagi.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private final SeekBar sb = findViewById(R.id.seekBar);
    private final TextView ptv = findViewById(R.id.percentTextview);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String value = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        final TextView tv = findViewById(R.id.billView);
        tv.setText("$" + value);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                ptv.setText(sb.getProgress() + "/" + sb.getMax());

            }
        });

    }
}
