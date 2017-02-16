package com.example.usuario.listviewpersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txtfaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtfaq = (TextView) findViewById(R.id.txtfaq);

        Bundle b;
        b = getIntent().getExtras();
        String conteudo = b.getString("");
        txtfaq.setText(conteudo);

    }
}
