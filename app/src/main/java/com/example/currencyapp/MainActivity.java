package com.example.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton eurtnd, tndeur ;
    EditText input;
    Button convert;
    TextView textres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eurtnd=findViewById(R.id.eurtnd);
        tndeur=findViewById(R.id.tndeur);
        input=findViewById(R.id.input);
        convert=findViewById(R.id.convert);
        textres=findViewById(R.id.res);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double res ;
                Double amount =Double.parseDouble(input.getText().toString());
                if ((eurtnd.isChecked()== true) && (tndeur.isChecked()==false)){
                    res =amount *3;
                    textres.setText(res.toString());

                }else if ((eurtnd.isChecked()== false) && (tndeur.isChecked()==true)){
                    res=amount*0.3;
                    textres.setText(res.toString());
                }else Toast.makeText(getApplicationContext(),"choose only one option ",Toast.LENGTH_LONG).show();
                eurtnd.setChecked(false);
                tndeur.setChecked(false);
            }
        });
    }
    }

