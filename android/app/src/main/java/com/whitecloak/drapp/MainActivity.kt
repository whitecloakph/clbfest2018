package com.whitecloak.drapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.whitecloak.drapp.camera.CameraActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launch_camera.setOnClickListener({ startActivity(Intent(this, CameraActivity::class.java)) })
    }
}