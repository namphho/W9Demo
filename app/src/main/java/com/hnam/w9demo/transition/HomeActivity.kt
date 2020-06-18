package com.hnam.w9demo.transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hnam.w9demo.MainActivity
import com.hnam.w9demo.R
import com.hnam.w9demo.sharedelement.MainSharedElementActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn_object_animator.setOnClickListener {

        }
        btn_transition.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        btn_shared_element.setOnClickListener{
            val i = Intent(this, MainSharedElementActivity::class.java);
            startActivity(i)
        }
    }
}
