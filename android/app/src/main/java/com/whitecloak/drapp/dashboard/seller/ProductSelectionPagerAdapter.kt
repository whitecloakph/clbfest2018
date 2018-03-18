package com.whitecloak.drapp.dashboard.seller

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class ProductSelectionPagerAdapter(fragmentManager: FragmentManager, private val products: Array<Product>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return ProductSelectionFragment.newInstance(products[position])
    }

    override fun getCount(): Int {
        return products.size
    }
}