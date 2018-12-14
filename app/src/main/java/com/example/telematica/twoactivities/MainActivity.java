package com.example.telematica.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    public void changeActivity(View view) {
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText interdistancia = findViewById(R.id.interdistancia);
        EditText ancho =findViewById(R.id.ancho_calzada);
        TextView s1,s2, s3, s4, s5, s6,s7, s8,s9;
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);
        s9=findViewById(R.id.s9);


        float d = Float.parseFloat(interdistancia.getText().toString());
        float A = Float.parseFloat(ancho.getText().toString());

        float a2=(A)/2;
        float d2=d/2;


        String xa2 = String.format("%.2f",a2);
        String xa = String.format("%.2f",A);
        String xd2 = String.format("%.2f",d2);
        String  xd= String.format("%.2f",d);

        s1.setText("0"+" , "+"0");
        s2.setText("0"+" , "+xa2);
        s3.setText("0"+" , "+xa);
        s4.setText(xd2+" , "+"0");
        s5.setText(xd2+" , "+xa2);
        s6.setText(xd2+" , "+xa);
        s7.setText(xd+" , "+"0");
        s8.setText(xd+" , "+xa2);
        s9.setText(xd+" , "+xa);



        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
    }
}
