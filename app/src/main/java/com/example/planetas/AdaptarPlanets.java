package com.example.planetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptarPlanets extends BaseAdapter {

   Context context;
   List<menu_planetas> lst;

    public AdaptarPlanets(Context context, List<menu_planetas> lst) {
        this.context = context;
        this.lst = lst;
    }


    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView mercurio;
        TextView text1;
        TextView text2;

       menu_planetas c=lst.get(i);

       if (view==null)
           view= LayoutInflater.from(context).inflate(R.layout.lista_tem, null);
       mercurio=view.findViewById(R.id.mercurio);
       text1=view.findViewById(R.id.text1);
       text2=view.findViewById(R.id.text2);

       mercurio.setImageResource(c.imagen);
       text1.setText(c.nombre);
       text2.setText(c.descripcion);

        return view;
    }
}
