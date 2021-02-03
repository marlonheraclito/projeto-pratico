package com.example.projeto_pratico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Adicionar extends AppCompatActivity {

    EditText nome, numero, email, dataN;
    RadioButton rdM, rdF, rdOutro;

    Button add, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);

        // EditText
        nome = findViewById(R.id.edt_Nome);
        numero = findViewById(R.id.edt_numero);
        email = findViewById(R.id.edt_Email);
        dataN = findViewById(R.id.edt_dataNasc);
        //Radio button
        rdM = findViewById(R.id.rbM);
        rdF = findViewById(R.id.rbF);
        rdOutro = findViewById(R.id.rbO);
         // Butons
        add = findViewById(R.id.btn_AdicinarContato);
        cancel = findViewById(R.id.btn_CancelarAdd);

        //Metodos
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarContato();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelar();
            }
        });
    }

    public void salvarContato(){

    }

    public void cancelar(){

    }
}
