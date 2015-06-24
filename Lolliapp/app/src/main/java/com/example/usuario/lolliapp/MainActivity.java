package com.example.usuario.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText caja,caja2,caja3;
    RadioButton m,f;

    Spinner spinner,spinner2,spinner3,spinner4;
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja=(EditText)findViewById(R.id.caja);


        m= (RadioButton) findViewById(R.id.radioButtonM);
        f= (RadioButton) findViewById(R.id.radioButtonF);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"20","21","22","23","24","25", "26", "27", "28", "29", "30"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // vacio

            }
        });
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] valores2 = {"1","2","3","4","5","6", "7", "8", "9", "10",
                             "11","12","13","14","15","16", "17", "18", "19", "20",
                             "21","22","23","24","25","26", "27", "28", "29", "30", "31"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // vacio

            }
        });
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        String[] valores3 = {"Enero","Febrero","Marzo","Abril","Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        spinner3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores3));
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // vacio

            }
        });
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        String[] valores4 = {"1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995"};
        spinner4.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores4));
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // vacio

            }
        });


    }
public void onput(View view){
    if(caja.getText()==null){
        Toast.makeText(getApplicationContext(), "Nombre necesario", Toast.LENGTH_SHORT).show();
    }
    Intent i = new Intent(this,MainActivity2Activity.class);
    i.putExtra("nombre",caja.getText().toString());
    i.putExtra("dia", spinner2.getSelectedItem().toString());
    i.putExtra("mes", spinner3.getSelectedItem().toString());
    i.putExtra("anio",spinner4.getSelectedItem().toString());
    i.putExtra("edad", spinner.getSelectedItem().toString());
    if(m.isChecked()==true) {
        i.putExtra("sexo", m.getText().toString());
    }else if(f.isChecked()==true){
        i.putExtra("sexo",f.getText().toString());
    }
    startActivity(i);


}

}
