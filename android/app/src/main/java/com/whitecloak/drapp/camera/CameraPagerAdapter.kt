package com.whitecloak.drapp.camera

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
class CameraPagerAdapter(fragmentManager: FragmentManager, private val productImages: Array<String>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return ProductImageOverlayFragment.newInstance(productImages[position])
    }

    override fun getCount(): Int {
        return productImages.size
    }
}