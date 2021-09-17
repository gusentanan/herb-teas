package com.example.herb_teas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTeas: RecyclerView
    private var list: ArrayList<Teas> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTeas = findViewById(R.id.rv_teas)
        rvTeas.setHasFixedSize(true)

        list.addAll(TeaData.listOfTea)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showRecyclerList(){
        rvTeas.layoutManager = LinearLayoutManager(this)
        val listTeaAdapter = ListTeaAdapter(list)
        rvTeas.adapter = listTeaAdapter

        listTeaAdapter.setOnItemClickCallback(object : ListTeaAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Teas) {
                showSelectedTea(data)
            }
        })
    }

    private fun showSelectedTea(tea: Teas){
        val moveData = Intent(this@MainActivity, DetailActivity::class.java)
        moveData.putExtra(DetailActivity.EXTRA_NAME, tea.name)
        moveData.putExtra(DetailActivity.EXTRA_DETAIL, tea.detail)
        moveData.putExtra(DetailActivity.EXTRA_IMAGE, tea.img)
        startActivity(moveData)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_about_me -> {
                val moveActivity = Intent(this@MainActivity, AboutMe::class.java)
                moveActivity.putExtra(AboutMe.MY_IMAGE, R.drawable.about_me)
                startActivity(moveActivity)
            }
        }
        return true
    }
}