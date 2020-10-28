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
    private ArrayList<Mascotas> item;
    private Object ViewGroup;

    public mascotasAdaptador(ArrayList<Mascotas> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public mascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         mascotasViewHolder mascota = new mascotasViewHolder();

        return mascota;
    }

    @Override
    public void onBindViewHolder(@NonNull mascotasViewHolder holder, int position) {

        mascotasViewHolder.nombre.setText(item.get(i).getNombre_mas());
        mascotasViewHolder.descripcion.setText(item.get(i).getDescripcion_mas());
        mascotasViewHolder.imagen.setText(item.get(i).getImagen_mas());

    }

    @Override
    public int getItemCount() {
        return item.size();
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
