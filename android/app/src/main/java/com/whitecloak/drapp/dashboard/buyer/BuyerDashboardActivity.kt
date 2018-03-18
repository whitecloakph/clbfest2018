package com.whitecloak.drapp.dashboard.buyer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import com.whitecloak.drapp.R
import com.whitecloak.drapp.models.Product
import kotlinx.android.synthetic.main.buyer_dashboard_layout.*

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class BuyerDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buyer_dashboard_layout)
        val asset_base_url = "file:///android_asset/"
        Picasso.get().load(asset_base_url + "dji_spark.png").into(product_image)
        purchased_items_viewpager.adapter = PurchasedItemSelectionPagerAdapter(supportFragmentManager , arrayOf(
                Product("mavic_air.png",
                        "Mavic Air",
                        "Mavic Air is an ultraportable device with a revolutionary multidimensional folding design.",
                        "USD $799"),
                Product("phantom.png",
                        "Phantom 4 Pro",
                        "All-new DJI Phantom camera with 1-inch 20MP Exmor R CMOS sensor, longer flight time and smarter features.",
                        "USD $772")))
    }
}