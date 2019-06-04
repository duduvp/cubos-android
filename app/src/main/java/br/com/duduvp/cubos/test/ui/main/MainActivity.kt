package br.com.duduvp.cubos.test.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.duduvp.cubos.test.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        /*val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)*/
    }

    override fun initViews() {
        presenter = MainPresenter(this)
    }
}