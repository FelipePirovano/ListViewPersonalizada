package com.example.usuario.listviewpersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private void enviarActivity(int num){

        if(num == 1){

            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta";
            intent.putExtra("", conteudo);
            startActivity(intent);
        }
    }

    private ListView listViewPersonalizada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPersonalizada = (ListView) findViewById(R.id.listViewPersonalizada);
        ArrayList<AtributosDaLista> perguntas = adicionarPerguntas();
        ArrayAdapter adapter = new AtributosAdapter(this, perguntas);
        listViewPersonalizada.setAdapter(adapter);
        listViewPersonalizada.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i){
                    case 0:
                        enviarActivity(1);
                        break;
                    case 1:
                        enviarActivity(2);
                        break;
                    case 2:
                        enviarActivity(3);
                        break;
                    case 3:
                        enviarActivity(4);
                        break;
                    case 4:
                        enviarActivity(5);
                        break;
                }
            }
        });
    }
    private ArrayList<AtributosDaLista> adicionarPerguntas() {

        ArrayList<AtributosDaLista> perguntas = new ArrayList<AtributosDaLista>();
        AtributosDaLista

        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);
        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);
        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);
        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);
        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);

        return perguntas;
    }
}
