package com.hnam.w9demo.sharedelement

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.bumptech.glide.Glide
import com.hnam.w9demo.R
import androidx.core.util.Pair
import kotlinx.android.synthetic.main.activity_main_shared_element.*

class MainSharedElementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shared_element)
        Glide.with(this).load("https://picsum.photos/id/100/860/640")
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .into(iv_avatar_1)
        Glide.with(this).load("https://picsum.photos/id/200/860/640")
            .placeholder(R.mipmap.ic_launcher)
            .centerCrop()
            .into(iv_avatar_2)
        Glide.with(this).load("https://picsum.photos/id/300/860/640")
            .placeholder(R.mipmap.ic_launcher)
            .centerCrop()
            .into(iv_avatar_3)

        Glide.with(this).load("https://picsum.photos/id/400/860/640")
            .placeholder(R.mipmap.ic_launcher)
            .centerCrop()
            .into(iv_avatar_4)

        iv_avatar_1.setOnClickListener {
            val p1 = Pair.create<View?, String?>(iv_avatar_1 as View, "profile")
            val p2 = Pair.create<View?, String?>(tv_descrption as View, "text")
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1, p2).toBundle()
            val intent = Intent(this, DetailSharedElement::class.java)
            intent.apply {
                putExtra("url", "https://picsum.photos/id/100/860/640");
            }
            startActivity(intent, options)
        }

        iv_avatar_2.setOnClickListener {
            val p1 = Pair.create<View?, String?>(iv_avatar_1 as View, "profile")
            val p2 = Pair.create<View?, String?>(tv_descrption as View, "text")
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1, p2).toBundle()
            val intent = Intent(this, DetailSharedBActivity::class.java)
            intent.apply {
                putExtra("url", "https://picsum.photos/id/200/860/640");
            }
            startActivity(intent, options)
        }

        iv_avatar_3.setOnClickListener {
            val options =
                ActivityOptionsCompat.makeSceneTransitionAnimation(this, iv_avatar_3, "photo").toBundle()
            val intent = Intent(this, DetailSharedElement::class.java)
            intent.apply {
                putExtra("url", "https://picsum.photos/id/300/860/640");
            }
            startActivity(intent, options)
        }

        iv_avatar_4.setOnClickListener {
            val options =
                ActivityOptionsCompat.makeSceneTransitionAnimation(this, iv_avatar_4, "photo").toBundle()
            val intent = Intent(this, DetailSharedElement::class.java)
            intent.apply {
                putExtra("url", "https://picsum.photos/id/400/860/640");
            }
            startActivity(intent, options)
        }

    }
}
