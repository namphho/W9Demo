package com.hnam.w9demo.sharedelement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.hnam.w9demo.R
import kotlinx.android.synthetic.main.activity_detail_shared_element.*

class DetailSharedBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_shared)
        val url = intent.extras?.getString("url")
        Glide.with(this).load(url)
            .into(imageView)
    }
}
