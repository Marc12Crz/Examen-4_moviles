package com.marcelo.cristhian.labmarcelo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marcelo.cristhian.labmarcelo.databinding.ListItemImgBinding
import java.io.File

/**
 * Adaptador para mostrar imágenes en un RecyclerView usando Glide.
 * Cada imagen se carga desde un archivo en el dispositivo.
 */
class GalleryAdapter(private val fileArray: Array<File>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    // ViewHolder que enlaza el archivo de imagen al ImageView.
    class ViewHolder(private val binding: ListItemImgBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(file: File) {
            Glide.with(binding.root).load(file).into(binding.localImg)
        }
    }

    // Infla y devuelve un ViewHolder para el item del RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(ListItemImgBinding.inflate(layoutInflater, parent, false))
    }

    // Asigna el archivo de imagen al ViewHolder en una posición específica.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fileArray[position])
    }

    // Devuelve la cantidad de elementos en el arreglo de archivos.
    override fun getItemCount(): Int {
        return fileArray.size
    }
}
