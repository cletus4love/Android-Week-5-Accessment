
package com.isaac.recyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.recyclerviewapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object{

    }

    lateinit var binding: ActivityMainBinding
     lateinit var myAdapter: RecyclerViewAdapter
     lateinit var names:Array<MyData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names:Array<MyData> = arrayOf(
            MyData("lex","Michel", R.drawable.ic_face_child),
            MyData("Okwo","Angels", R.drawable.ic__hair_day),
            MyData("Parker", "Davis", R.drawable.ic_greeters_face),
            MyData("Monaghan", "Fashion", R.drawable.ic_zeimusu_face_),
            MyData("Alamode","Johnny" , R.drawable.ic_personnage_femme),
            MyData("Alexander", "Michele", R.drawable.ic_face_child),
            MyData("Osier", "Angels", R.drawable.ic_face_child),
            MyData("Royce",   "Johnsons",R.drawable.ic__hair_day),
            MyData("Babas",  "Fashion", R.drawable.ic__hair_day),
            MyData("Olae",    "Johnson", R.drawable.ic_zeimusu_face_),
            MyData("Elizabeth",       "Michael", R.drawable.ic_greeters_face),
            MyData("Jessica",      "Adams", R.drawable.ic_personnage_femme),
            MyData("Babar", "Fashola", R.drawable.ic_face3),
            MyData("Alamode",    "John", R.drawable.ic_face1),
            MyData("Calendar",       "Mime",R.drawable.ic_face8),
            MyData("Bucky",      "San",R.drawable.ic_zeimusu_face_),
            MyData("Cynthia",   "Patrick",R.drawable.ic_face2),
            MyData("Darlington",  "Enema", R.drawable.ic_greeters_face),
            MyData("Johnson",    "Charlie's",R.drawable.ic_face9),
            MyData("Ifeyi", "Oldie", R.drawable.ic_face1)

        )

        myAdapter= RecyclerViewAdapter(names)
        binding.recycler.adapter=myAdapter


        







    }
}


