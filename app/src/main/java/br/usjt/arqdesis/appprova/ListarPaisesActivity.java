package br.usjt.arqdesis.appprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPaisesActivity extends AppCompatActivity {

    ListView listView;
    Paises[] lista;
    public static final String PAIS = "br.usjt.ftce.desmob.clientev1.cliente";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_paises);
        listView = (ListView) findViewById(R.id.lista_de_paises);
        Intent intent = getIntent();
        ArrayList<Paises> clientes = (ArrayList<Paises>)intent.getSerializableExtra(MainActivity.LISTA);
        System.out.println("Clientes: "+clientes);
        lista = clientes.toArray(new Paises[][0]);

        BaseAdapter adapter = new PaisesAdapter(this, lista);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(ListarPaisesActivity.this, DetalhePaisesActivity.class);
                intent1.putExtra(PAIS, lista[i]);
                startActivity(intent1);
            }
        });

    }

}
