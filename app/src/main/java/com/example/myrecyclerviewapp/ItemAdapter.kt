package com.example.myrecyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp.model.Afirmaciones

class ItemAdapter( // Default Constructor
    private val context : Context,
    private val dataset : List<Afirmaciones> // Lista que quiero mostrar
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Inicializamos las vistas
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // Este metodo es para seleccionar el layout resource file.xml (list_item)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // Acciones sobre el layout resource
    override fun onBindViewHolder(
        holder: ItemViewHolder, // Tiene el vinculo del primer metodo
        position: Int) { // Item posicion
            val item = dataset[position]
            holder.textView.text =  context.resources.getString(item.stringRecursoId)
            holder.imageView.setImageResource(item.imageResourceId)
    }

    // Obtiene el numero de items
    override fun getItemCount(): Int {
        return dataset.size
    }
}