package com.example.usuario.listviewpersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PerguntasRespostasAdapter extends ArrayAdapter<PerguntaResposta> {

    private final Context context;
    private final ArrayList<PerguntaResposta>elementos;

    public PerguntasRespostasAdapter(Context context, ArrayList<PerguntaResposta> elementos) {
        super(context, R.layout.item_lista_pergunta, elementos);
        this.context = context;
        this.elementos = elementos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_lista_pergunta, parent, false);

        TextView pergunta = (TextView) rowView.findViewById(R.id.pergunta);
        pergunta.setText(elementos.get(position).getPergunta());

        return rowView;
    }
}
