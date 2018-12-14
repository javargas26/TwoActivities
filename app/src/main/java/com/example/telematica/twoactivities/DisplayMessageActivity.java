package com.example.telematica.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

        TextView textView = findViewById(R.id.textView);
        float convertedVal = Float.parseFloat(message);
        float add= (float) 0.258;
        float prueba= convertedVal+add;
        String value= Double.toString(prueba);
        String userInput = String.format("%.3f",prueba);

        textView.setText(userInput);
    }
}
