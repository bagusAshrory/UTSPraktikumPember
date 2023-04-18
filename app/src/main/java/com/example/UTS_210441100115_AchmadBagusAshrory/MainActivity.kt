package com.example.UTS_210441100115_AchmadBagusAshrory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: Adapternya
    lateinit var listData: ArrayList<DataPemainChelsea>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(DataPemainChelsea("Mason Mount", "180441100007", "25 Tahun", R.drawable.mount))
        listData.add(DataPemainChelsea("Kai Hvertz", "160441100043", "22 tahun", R.drawable.havert))
        listData.add(DataPemainChelsea("Mikhaylo Mudryk", "150441100044", "20 tahun", R.drawable.mudryk))
        listData.add(DataPemainChelsea("Hakim Ziyech", "150441100010", "24 tahun", R.drawable.ziyech))
        listData.add(DataPemainChelsea("Enzo Fernandez", "130441100010", "20 tahun", R.drawable.enzoo))
        listData.add(DataPemainChelsea("Reece James", "210441100067", "22 tahun", R.drawable.james))
        listData.add(DataPemainChelsea("Ben Chilwel", "180441100043", "24 tahun", R.drawable.cchilwel))
        listData.add(DataPemainChelsea("Cristian Pulisic", "200441100014", "25 tahun",
            R.drawable.paulisic
        ))
        listData.add(DataPemainChelsea("Raheem Sterling", "140441100007", "26 tahun", R.drawable.strerling))
        listData.add(DataPemainChelsea("Piere Aubameyang", "210441100019", "24 tahun", R.drawable.auba))
        listData.add(DataPemainChelsea("N'golo Kante", "220441100118", "26 tahun", R.drawable.kante))
        listData.add(DataPemainChelsea("Mateo Kovacic", "140441100030", "28 tahun", R.drawable.kova))
        listData.add(DataPemainChelsea("Conor Gallagher", "160441100120", "20 tahun",
            R.drawable.gallagher
        ))
        listData.add(DataPemainChelsea("Joao Felix", "2040441100011", "23 tahun", R.drawable.felix))
        listData.add(DataPemainChelsea("Cesar Azpilicueta", "2040441100192", "24 tahun", R.drawable.azpi))
        listData.add(DataPemainChelsea("Thiago Silva", "2040441100023", "35 tahun", R.drawable.thiago))
        listData.add(DataPemainChelsea("Marc Cucurella", "2040441100181", "26 tahun", R.drawable.cucu))
        listData.add(DataPemainChelsea("Wesley Fofana", "2040441100002", "19 tahun", R.drawable.fofana))
        listData.add(DataPemainChelsea("Noni Madueke", "2040441100013", "21 tahun", R.drawable.madueke))
        listData.add(DataPemainChelsea("Loftus-Cheek", "2040441100801", "27 tahun", R.drawable.cheek))
        listData.add(DataPemainChelsea("Kalidou Koulibaly", "2040441100801", "31 tahun", R.drawable.kou))
        listData.add(DataPemainChelsea("Chalobah", "2040441100121", "23 tahun", R.drawable.cha))
        listData.add(DataPemainChelsea("Kepa Arizabalaga", "2040441100213", "28 tahun", R.drawable.kepa))
        listData.add(DataPemainChelsea("Eduard Mendy", "2040441100053", "31 tahun", R.drawable.mendy))
        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapternya(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapternya(listData, this)
        recycle.adapter = recycleAdapter
    }
}