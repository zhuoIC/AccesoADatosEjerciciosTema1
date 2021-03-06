package com.example.amechy.accesoadatostema1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.MalformedURLException;
import java.net.URL;

public class MostrarWeb extends AppCompatActivity implements View.OnClickListener {
    Button btnIr;
    EditText etxNavegar;
    URL url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_web);

        btnIr = (Button) findViewById(R.id.btnIr);
        btnIr.setOnClickListener(this);
        etxNavegar = (EditText) findViewById(R.id.etxNavegar);
    }

    @Override
    public void onClick(View view) {
        try {
            url = new URL(etxNavegar.getText().toString());
        } catch (MalformedURLException e) {

            e.printStackTrace();
        }


        Bundle bundle = new Bundle();
        bundle.putString("webMostrada", etxNavegar.getText().toString());
        Intent intent = new Intent(this, WebMostrada.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}

