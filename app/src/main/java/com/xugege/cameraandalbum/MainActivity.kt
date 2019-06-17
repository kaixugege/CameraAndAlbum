package com.xugege.cameraandalbum

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun openBrowsable(view: View) {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("lzh://goods:8080/goodsDetail?goodsId=100100"))
        startActivity(intent)
    }

    fun  next(view: View){
        startActivity(Intent(this, ContentActivity::class.java))
    }

}
