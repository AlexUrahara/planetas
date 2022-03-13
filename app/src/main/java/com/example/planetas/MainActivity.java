package com.example.planetas;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    ListView ListViewmenu_planetas;
    List<menu_planetas> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListViewmenu_planetas = findViewById(R.id.listaplanetas);
        AdaptarPlanets adapter = new AdaptarPlanets(this, GetData());
        ListViewmenu_planetas.setAdapter(adapter);
        ListViewmenu_planetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                menu_planetas c = lst.get(i);
                Toast.makeText(getBaseContext(),c.nombre,Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<menu_planetas> GetData() {
        lst=new ArrayList<>();
        lst.add(new menu_planetas(1,R.drawable.mercurio,"Mercurio","el primer planeta"));
        lst.add(new menu_planetas(2,R.drawable.venus,"venus","el segundo planeta"));
        lst.add(new menu_planetas(3,R.drawable.tierra,"tierra","el tercer planeta"));
        lst.add(new menu_planetas(4,R.drawable.marte,"marte","el cuarto planeta"));
        lst.add(new menu_planetas(5,R.drawable.jupiter,"jupiter","el quinto planeta"));
        lst.add(new menu_planetas(6,R.drawable.saturno,"saturno","el sexto planeta"));
        lst.add(new menu_planetas(7,R.drawable.urano,"urano","el septimo planeta"));
        lst.add(new menu_planetas(8,R.drawable.neptuno,"neptuno","el octavo planeta"));
        return lst;
    }
}