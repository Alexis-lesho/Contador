package com.example.alexis.lexo.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText mContador;
    private Button mBotoncontar,mBotonreiniciar;
    int inicio=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContador = (EditText) findViewById(R.id.conta);
        mBotoncontar = (Button) findViewById(R.id.jboton);
        mBotonreiniciar = (Button) findViewById(R.id.inicio);
    }
    public void respuesta (View v) {

        inicio++;
        mContador.setText(inicio);
    }

    public void reiniciar(View v) {
    mContador.setText("0");

    }
}
