package com.example.numeros_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numero1;
    EditText numero2;
    EditText numero3;
    TextView resultado;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.editText6);
        numero2 = (EditText) findViewById(R.id.editText7);
        numero3 = (EditText) findViewById(R.id.editText8);
        resultado = (TextView) findViewById(R.id.textView4);
        calcular = (Button) findViewById(R.id.button2);
        calcular.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        int n3 = Integer.parseInt(numero3.getText().toString());

        if (n1 > n2 && n1 > n3) {
            resultado.setText("El numero mayor es " + n1);
        } else {
            if (n2 > n1 && n2 > n3) {
                resultado.setText("El numero mayor es " + n2);
            } else {
                resultado.setText("El numero mayor es " + n3);
            }
        }
    }
}
