package com.example.salvatorepetrillo.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // view layout
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imposto i riferimenti del layout
        vMessaggio = findViewById(R.id.txtMessaggio);
        vAumenta = findViewById(R.id.btnAumenta);
        vDiminuisci = findViewById(R.id.btnDiminuisci);


    }
}
