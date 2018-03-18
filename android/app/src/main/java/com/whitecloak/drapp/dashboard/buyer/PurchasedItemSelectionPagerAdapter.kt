package com.whitecloak.drapp.dashboard.buyer

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.whitecloak.drapp.dashboard.seller.Product

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class PurchasedItemSelectionPagerAdapter(fragmentManager: FragmentManager, private val products: Array<Product>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return PurchasedItemFragment.newInstance(products[position])
    }

    override fun getCount(): Int {
        return products.size
    }

}