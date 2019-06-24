package com.xugege.cameraandalbum

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xugege.camera.ContentActivity
import com.xugege.example.browsable_open_app.BrowActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openBrowsable(view: View) {
        startActivity(Intent(this, BrowActivity::class.java))
    }

    fun next(view: View) {
        startActivity(Intent(this, ContentActivity::class.java))
    }

}
