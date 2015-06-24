package com.example.usuario.lolliapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        TextView nombre,sexo,dia,edad;
        Bundle bolsa = getIntent().getExtras();
        nombre=(TextView)findViewById(R.id.nombre);
        sexo=(TextView)findViewById(R.id.sexo);
        dia=(TextView)findViewById(R.id.dia);

        edad=(TextView)findViewById(R.id.edad);
        nombre.setText("Nombre:"+bolsa.getString("nombre"));
        sexo.setText("Genero:"+bolsa.getString("sexo"));
        dia.setText("Fech. nac.:\n"+bolsa.getString("dia")+"/"+bolsa.getString("mes")+"/"+bolsa.getString("anio"));

        edad.setText("Edad:"+bolsa.getString("edad"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
