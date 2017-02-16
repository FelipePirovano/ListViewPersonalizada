package com.example.usuario.listviewpersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Adicionar Resposta conforme setOnItemClickListener
    private void adicionarResposta(int num){

        if(num == 1) {
            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta 1";
            intent.putExtra("", conteudo);
            startActivity(intent);

        }else if (num == 2){
            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta 2";
            intent.putExtra("", conteudo);
            startActivity(intent);

        }else if (num == 3){
            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta 3";
            intent.putExtra("", conteudo);
            startActivity(intent);

        }else if (num == 4){
            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta 4";
            intent.putExtra("", conteudo);
            startActivity(intent);

        }else if (num == 5){
            Intent intent = new Intent(this, Main2Activity.class);
            String conteudo = "Conteudo da pergunta 5";
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

        final ArrayList<AtributosDaLista> perguntas = adicionarPerguntas();
        ArrayAdapter adapter = new AtributosAdapter(this, perguntas);
        listViewPersonalizada.setAdapter(adapter);
        //Clique da lista
        listViewPersonalizada.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        adicionarResposta(1);
                        break;
                    case 1:
                        adicionarResposta(2);
                        break;
                    case 2:
                        adicionarResposta(3);
                        break;
                    case 3:
                        adicionarResposta(4);
                        break;
                    case 4:
                        adicionarResposta(5);
                        break;
                }
            }
        });
    }
    //Adicionar Perguntas
    private ArrayList<AtributosDaLista> adicionarPerguntas() {

        ArrayList<AtributosDaLista> perguntas = new ArrayList<AtributosDaLista>();
        AtributosDaLista

        e = new AtributosDaLista("Por que essa pergunta esta aqui, nao faz sentido.");
        perguntas.add(e);
        e = new AtributosDaLista("Por que essa pergunta esta aqui, faz sentido.");
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
