package com.example.usuario.listviewpersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txtfaq1;
    private TextView txtfaq2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtfaq1 = (TextView) findViewById(R.id.txtfaq1);
        txtfaq2 = (TextView) findViewById(R.id.txtfaq2);

        Intent intent = getIntent();
        String paramentro = (String)intent.getSerializableExtra("dados");
        String paramentro2 = (String)intent.getSerializableExtra("dados2");

        txtfaq1.setText(paramentro);
        txtfaq2.setText(paramentro2);
    }
}
