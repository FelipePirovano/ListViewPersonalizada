package com.example.usuario.listviewpersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AtributosAdapter extends ArrayAdapter<AtributosDaLista> {

    private final Context context;
    private final ArrayList<AtributosDaLista>elementos;

    public AtributosAdapter(Context context, ArrayList<AtributosDaLista> elementos) {
        super(context, R.layout.formato, elementos);
        this.context = context;
        this.elementos = elementos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.formato, parent, false);

        TextView pergunta = (TextView) rowView.findViewById(R.id.pergunta);
        pergunta.setText(elementos.get(position).getPergunta());

        return rowView;
    }
}
