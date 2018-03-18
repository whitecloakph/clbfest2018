package com.whitecloak.drapp.camera

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.whitecloak.drapp.R

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
                .replace(R.id.container, CameraFragment.newInstance())
                .commit()
    }
}