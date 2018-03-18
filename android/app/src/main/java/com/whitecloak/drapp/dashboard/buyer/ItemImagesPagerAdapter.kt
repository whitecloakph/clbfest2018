package com.whitecloak.drapp.dashboard.buyer

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class ItemImagesPagerAdapter (fragmentManager: FragmentManager, private val productImages: Array<String>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return ItemImageDisplayFragment.newInstance(productImages[position])
    }

    override fun getCount(): Int {
        return productImages.size
    }

}