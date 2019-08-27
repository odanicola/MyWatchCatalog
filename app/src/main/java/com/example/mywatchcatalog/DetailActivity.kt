package com.example.mywatchcatalog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import java.util.*

class DetailActivity : AppCompatActivity()  {
    companion object{
        const val WATCH_NAME = "Extra Name"
        const val WATCH_PRICE = "119.000,00"
        const val WATCH_DESC = "Extra Desc"
        const val WATCH_IMG = "Extra Image"
        const val WATCH_SPECS = "Extra Specs"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_watch_detail)

        val name = intent.getStringExtra(WATCH_NAME)
        val tvImg: ImageView = findViewById(R.id.detail)

        Glide.with(this).load(intent.getStringExtra(WATCH_IMG)).into(tvImg)

        val actionbar = supportActionBar
        actionbar!!.title = name
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvPrice: TextView = findViewById(R.id.detail_price)
        val price: String = intent.getStringExtra(WATCH_PRICE)
        tvPrice.text = "Rp. $price"

        val tvDesc: TextView = findViewById(R.id.detail_desc)
        val desc: String = intent.getStringExtra(WATCH_DESC)
        tvDesc.text = desc

        val tvSpecs: TextView = findViewById(R.id.detail_specs)
        val specs: String = intent.getStringExtra(WATCH_SPECS)
        tvSpecs.text = specs
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}