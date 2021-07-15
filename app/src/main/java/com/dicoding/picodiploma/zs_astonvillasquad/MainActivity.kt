package com.dicoding.picodiploma.zs_astonvillasquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlayers: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlayers = findViewById(R.id.rv_players)
        rvPlayers.setHasFixedSize(true)

        list.addAll(PlayersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPlayerAdapter(list)
        rvPlayers.adapter = listHeroAdapter
    }
}
