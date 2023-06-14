package com.example.recipetest20

import android.os.Bundle
import android.view.View
import android.widget.CheckedTextView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.chip.Chip


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)


        val ctv1 = findViewById<CheckedTextView>(R.id.ctv1)
        val ctv2 = findViewById<CheckedTextView>(R.id.ctv2)
        val ctv3 = findViewById<CheckedTextView>(R.id.ctv3)
        val ctv4 = findViewById<CheckedTextView>(R.id.ctv4)
        val ctv5 = findViewById<CheckedTextView>(R.id.ctv5)

        val searchView = findViewById<SearchView>(R.id.search_view)
        val c1 = findViewById<Chip>(R.id.c1)
        val c2= findViewById<Chip>(R.id.c2)
        val c3 = findViewById<Chip>(R.id.c3)
        val c4 = findViewById<Chip>(R.id.c4)
        val c5 = findViewById<Chip>(R.id.c5)

        val cctv1 = findViewById<CardView>(R.id.cctv1)
        val cctv2 = findViewById<CardView>(R.id.cctv2)
        val cctv3 = findViewById<CardView>(R.id.cctv3)
        val cctv4 = findViewById<CardView>(R.id.cctv4)
        val cctv5 = findViewById<CardView>(R.id.cctv5)




        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // Do something with the query
                val cctvs = listOf(cctv2, cctv3, cctv4, cctv5)
                cctvs.forEach { it.visibility = View.VISIBLE }
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                // Update the CheckedTextView based on the search query

                val cctvs = listOf(cctv2, cctv3, cctv4, cctv5)
                cctvs.forEach { it.visibility = View.INVISIBLE }
                return false
            }
        })




        ctv1.setOnClickListener {
            ctv1.isChecked = !ctv1.isChecked
            if (ctv1.isChecked ) {
                c1.visibility = View.VISIBLE
            } else {
                c1.visibility = View.GONE
            }
            c1.setOnClickListener {
                ctv1.isChecked = !ctv1.isChecked
            }
        }

        ctv2.setOnClickListener {
            ctv2.isChecked = !ctv2.isChecked
            if (ctv2.isChecked ) {
                c2.visibility = View.VISIBLE
            } else {
                c2.visibility = View.GONE
            }
            c2.setOnClickListener {
                ctv2.isChecked = !ctv2.isChecked
            }
        }

        ctv3.setOnClickListener {
            ctv3.isChecked = !ctv3.isChecked
            if (ctv3.isChecked ) {
                c3.visibility = View.VISIBLE
            } else {
                c3.visibility = View.GONE
            }
            c3.setOnClickListener {
                ctv3.isChecked = !ctv3.isChecked
            }
        }

        ctv4.setOnClickListener {
            ctv4.isChecked = !ctv4.isChecked
            if (ctv4.isChecked ) {
                c4.visibility = View.VISIBLE
            } else {
                c4.visibility = View.GONE
            }
            c4.setOnClickListener {
                ctv4.isChecked = !ctv4.isChecked
            }
        }

        ctv5.setOnClickListener {
            ctv5.isChecked = !ctv5.isChecked
            if (ctv5.isChecked ) {
                c5.visibility = View.VISIBLE
            } else {
                c5.visibility = View.GONE
            }
            c5.setOnClickListener {
                ctv5.isChecked = !ctv5.isChecked
            }
        }



          }

    }











