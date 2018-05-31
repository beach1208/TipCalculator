package com.example.nagi.tipcalculator;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.nagi.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        EditText editText = findViewById(R.id.editText);
        String inputValue = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, inputValue);
        startActivity(intent);

    }
}
