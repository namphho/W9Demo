package com.hnam.w9demo

import android.app.ActivityOptions.makeSceneTransitionAnimation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import com.hnam.w9demo.transition.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_detail.setOnClickListener {
            val options = makeSceneTransitionAnimation(this)
            startActivity(Intent(this, DetailActivity::class.java), options.toBundle())
        }
    }
}
