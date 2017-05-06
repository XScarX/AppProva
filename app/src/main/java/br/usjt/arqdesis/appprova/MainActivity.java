package br.usjt.arqdesis.appprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
/**Oscar B. Cardoso RA: 201517189 */

    private EditText continente;
    public static final String CHAVE = "br.usjt.appprova.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continente = (EditText) findViewById(R.id.busca_nome_cliente);
    }

    public void buscarContinente(View view){
        Intent intent = new Intent(this, ListarPaisesActivity.class);
        String chave = continente.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}
