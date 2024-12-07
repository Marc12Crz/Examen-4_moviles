package com.marcelo.cristhian.labmarcelo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcelo.cristhian.labmarcelo.databinding.ActivityGalleryBinding
import java.io.File

/**
 * Activity para mostrar una galería de imágenes usando ViewPager2.
 * Carga imágenes desde el primer directorio de medios externos del dispositivo.
 */
class GalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val directory = File(externalMediaDirs[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}
