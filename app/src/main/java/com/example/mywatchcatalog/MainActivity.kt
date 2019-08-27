package com.example.mywatchcatalog

import android.content.Intent
import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.DecorToolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mywatchcatalog.Adapter.ListWatchAdapter
import com.example.mywatchcatalog.DetailActivity.Companion.WATCH_DESC
import com.example.mywatchcatalog.DetailActivity.Companion.WATCH_IMG
import com.example.mywatchcatalog.DetailActivity.Companion.WATCH_NAME
import com.example.mywatchcatalog.DetailActivity.Companion.WATCH_PRICE
import com.example.mywatchcatalog.DetailActivity.Companion.WATCH_SPECS
import com.example.mywatchcatalog.Model.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    private lateinit var rcWatch: RecyclerView
    private var list: ArrayList<Catalog> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcWatch = findViewById(R.id.watch_catalog)
        rcWatch.setHasFixedSize(true)
        rcWatch.addItemDecoration(DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL))
        list.addAll(WatchObject.listData)
        showWatchCatalog()
    }

    private fun showWatchCatalog() {
        rcWatch.layoutManager = LinearLayoutManager(this)
        val listWatchAdapter = ListWatchAdapter(list)
        rcWatch.adapter = listWatchAdapter

        listWatchAdapter.setOnItemClickCallback(object : ListWatchAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Catalog) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(data: Catalog) {
        val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
        intentDetail.putExtra(WATCH_NAME, data.name)
        intentDetail.putExtra(WATCH_DESC, data.desc)
        intentDetail.putExtra(WATCH_PRICE, data.price)
        intentDetail.putExtra(WATCH_SPECS, data.specs)
        intentDetail.putExtra(WATCH_IMG, data.image)

        startActivity(intentDetail)
        //Toast.makeText(this, "You choose: " + data.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedItem: Int) {
        when (selectedItem) {
            R.id.menu_about -> {
                val intentDetail = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentDetail)
            }
        }
    }
}
