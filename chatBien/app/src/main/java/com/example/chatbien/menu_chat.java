package com.example.chatbien;

import androidx.appcompat.app.AppCompatActivity;
import java.time.LocalDate;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.chatbien.objetos.Mensaje;

import java.time.LocalDate;

public class menu_chat extends AppCompatActivity implements View.OnClickListener {
    private Button btAjustes,btEnviar;
    private EditText etMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_chat);
        btAjustes=findViewById(R.id.btAjustes);
        btEnviar=findViewById(R.id.btEnviar);
        etMensaje= findViewById(R.id.etMensaje);
        btAjustes.setOnClickListener(this);
        btEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btAjustes)){
            Intent i = new Intent(this, menu_configuracion.class);
            startActivity(i);
            finish();
        }else if(v.equals(btEnviar)){
            Mensaje mensaje = new Mensaje(1111,etMensaje.getText().toString());

        }
    }
 /*   class AdaptadorMensajes extends ArrayAdapter<Mensaje> {
        AppCompatActivity appCompatActivity;
        AdaptadorMensajes(AppCompatActivity context){
            super(context,R.layout.mensa_propio);
            appCompatActivity=context;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.mensa_propio, null);
            TextView tvMensa = item.findViewById(R.id.tvMensaj);
            tvMensa.setText(listaUsuarios.get(position).getNombre());
            TextView tvHor = item.findViewById(R.id.tvHor);
            tvHor.setText(listaUsuarios.get(position).getApellidos());

            return(item);
        }
    }*/
}