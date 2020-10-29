package com.example.petagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class mascotasAdaptador extends RecyclerView.Adapter<mascotasAdaptador.mascotasViewHolder>{
    private ArrayList<Mascotas> mascotas;

    public mascotasAdaptador(ArrayList<Mascotas> mascotas) {

        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public mascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mascotas, parent,false);


        return new mascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull mascotasViewHolder mascotasViewHolder, int position) {

        Mascotas mascota = mascotas.get(position);


        mascotasViewHolder.nombre.setText(mascota.getNombre_mas());
        mascotasViewHolder.descripcion.setText(mascota.getDescripcion_mas());
        mascotasViewHolder.imagen.setImageResource(mascota.getImagen_mas());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public class    mascotasViewHolder extends  RecyclerView.ViewHolder{
        TextView nombre, descripcion;
        ImageView imagen;

        public  mascotasViewHolder(View itemView) {
            super(itemView);

            nombre= (TextView)itemView.findViewById(R.id.nombre);
            descripcion=(TextView)itemView.findViewById(R.id.descripcion);
            imagen=(ImageView)itemView.findViewById(R.id.imgMascota);

        }

    }



}
