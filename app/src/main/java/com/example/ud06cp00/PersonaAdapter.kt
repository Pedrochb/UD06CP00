package com.example.ud06cp00

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonaAdapter(private val personas: List<Persona>) :
    RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ivFoto: ImageView = view.findViewById(R.id.ivFoto)
        private val tvNombre: TextView = view.findViewById(R.id.tvNombre)
        private val tvDescripcion: TextView = view.findViewById(R.id.tvDescripcion)

        fun bind(persona: Persona) {
            ivFoto.setImageResource(persona.foto)
            tvNombre.text = persona.nombre
            tvDescripcion.text = persona.descripcion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.bind(personas[position])
    }

    override fun getItemCount(): Int = personas.size
}