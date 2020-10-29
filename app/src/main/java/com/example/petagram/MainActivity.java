package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager imagener;
    private  RecyclerView.Adapter adaptador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intencion= new Intent(getApplicationContext(),MenuslideActivity2.class);
        startActivity(intencion);
        ArrayList<Mascotas> datos = new ArrayList<>();
        datos.add(new Mascotas(R.drawable.perro1,"Toby","Macho con 4 años"));
        datos.add(new Mascotas(R.drawable.perro2,"Joselo","Macho con 22 años"));
        datos.add(new Mascotas(R.drawable.perro3,"Charly","Se lleva bien con niño, 4 años"));
        datos.add(new Mascotas(R.drawable.perro4,"Oreja","Sin datos"));
        datos.add(new Mascotas(R.drawable.perro5,"Carlos","Macho viejo, sin dientes"));


        reciclador=(RecyclerView)findViewById(R.id.reciclador);
        imagener=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        reciclador.setLayoutManager(imagener);

        adaptador=new mascotasAdaptador(datos);
        reciclador.setAdapter(adaptador);

        public void Registrar(View view);
        AdminSqliteOpenHelper admin= new AdminSqliteOpenHelper(this, "administacion",null,1);
        SQLiteDatabase db   =   admin.getWritableDatabase();

        


    }
}