package com.example.salvatorepetrillo.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // view layout
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;
    private Button vAzzera;
    private CheckBox vRaddoppio;
    // verifichiamo come caricare file in github

    private int contatore = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imposto i riferimenti del layout
        vMessaggio = findViewById(R.id.txtMessaggio);
        vAumenta = findViewById(R.id.btnAumenta);
        vDiminuisci = findViewById(R.id.btnDiminuisci);
        vAzzera = findViewById(R.id.btnAzzera);
        vRaddoppio = findViewById(R.id.checkBox);

        //imposto azione pulsanti(buttom)
        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                visualizzaMessaggio();
                if(vRaddoppio.isChecked())
                {
                    ++contatore;
                }
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
                visualizzaMessaggio();
            }
        });

        vAzzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatore = 0;
                visualizzaMessaggio();
            }
        });

    }

    /**
     * funzione che visualizza il valore del contatore.
     */
    private void visualizzaMessaggio ()
    {
        vMessaggio.setText(getString(R.string.valore) + contatore);
    }

}
