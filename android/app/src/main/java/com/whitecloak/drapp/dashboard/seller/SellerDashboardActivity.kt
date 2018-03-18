package com.whitecloak.drapp.dashboard.seller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.whitecloak.drapp.R
import kotlinx.android.synthetic.main.seller_dashboard_layout.*

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
class SellerDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seller_dashboard_layout)
        val productSelectionPagerAdapter = ProductSelectionPagerAdapter(supportFragmentManager, getProducts())
        product_selection.adapter = productSelectionPagerAdapter
    }

    fun getProducts() = arrayOf(
            Product("mavic_air.png",
                    "Mavic Air",
                    "Mavic Air is an ultraportable device with a revolutionary multidimensional folding design.",
                    "USD $799"),
            Product("phantom.png",
                    "Phantom 4 Pro",
                    "All-new DJI Phantom camera with 1-inch 20MP Exmor R CMOS sensor, longer flight time and smarter features.",
                    "USD $772"))
}