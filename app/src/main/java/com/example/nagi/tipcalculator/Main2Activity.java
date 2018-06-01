package com.example.nagi.tipcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private  SeekBar sb;
    private SeekBar sb2;
    private TextView ptv;
    private TextView ptv2;
    private TextView newbill;
    private Integer valueInt;
    private  Integer BillplusTip;
//    private Integer tipAmount;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        final String value = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        valueInt = Integer.parseInt(value);

        final TextView tv = findViewById(R.id.billView);
        tv.setText("$" + value);

        sb = findViewById(R.id.seekBar);
        sb2 = findViewById(R.id.seekBar2);

        ptv = findViewById(R.id.percentTextview);
        ptv2 = findViewById(R.id.personTextview);

        newbill = findViewById(R.id.newBillstv);




        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                ptv.setText("" + progress + "%");
                BillplusTip = valueInt + valueInt* progress / 100;
                newbill.setText("$" + BillplusTip);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}

        });


        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int prog, boolean fromUser) {
                ptv2.setText(" " + prog + " people");

                if(prog == 0){
                    newbill.setText("$" + BillplusTip);
                }else{
                    int divideBill = BillplusTip /prog;
                    newbill.setText("$" + divideBill);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
