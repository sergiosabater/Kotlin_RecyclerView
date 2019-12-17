package com.developers.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

/*
 * Created by Sergio Sabater on 10/06/19.
 */

class MainActivity : AppCompatActivity() {

    val listaAnimales = listOf<String>("Perro", "Gato", "Loro", "Periquito",
            "Canario", "Tortuga", "Pez", "Iguana", "Serpiente",
            "Conejo", "Mapache", "Papagallo", "Pato")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view_name.layoutManager=LinearLayoutManager(this,
                LinearLayout.VERTICAL,false)
        recycler_view_name.adapter=MyAdapter(listaAnimales,this)
    }
}
