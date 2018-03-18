package com.whitecloak.drapp.dashboard.buyer

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import com.whitecloak.drapp.R
import kotlinx.android.synthetic.main.buyer_validate_item_layout.*

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
const val ratio_scale = 2

class BuyerValidateItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buyer_validate_item_layout)
        product_image_view_pager.adapter =
                ItemImagesPagerAdapter(supportFragmentManager,
                        arrayOf("dji_spark.png", "dji_spark_side.png", "dji_spark_bottom.png"))
        product_image_view_pager.clipToPadding = false
        product_image_view_pager.pageMargin = 24
        product_image_view_pager.setPadding(48,8,48, 8)
        product_image_view_pager.offscreenPageLimit = 3
        product_image_view_pager.addOnPageChangeListener(object: OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                if (state == ViewPager.SCROLL_STATE_IDLE){
                    val currentItemPosition = product_image_view_pager.currentItem
                    var item = getItemDisplayFragment(currentItemPosition)
                    item.scaleImage(1F)
                    if(currentItemPosition > 0){
                        item = getItemDisplayFragment(currentItemPosition - 1)
                        item.scaleImage((1 - ratio_scale).toFloat())
                    }

                    if(currentItemPosition + 1 < (product_image_view_pager.adapter as ItemImagesPagerAdapter).count){
                        item = getItemDisplayFragment(currentItemPosition + 1)
                        item.scaleImage((1 - ratio_scale).toFloat())
                    }
                }
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                var item = getItemDisplayFragment(position)
                val ratioScale = 2
                var scale = 1 - (positionOffset * ratioScale)
                item.scaleImage(scale)

                if(position + 1 < (product_image_view_pager.adapter as ItemImagesPagerAdapter).count){
                    item = getItemDisplayFragment(position + 1)
                    scale = positionOffset * ratioScale + (1 - ratioScale)
                    item.scaleImage(scale)
                }
            }

            override fun onPageSelected(position: Int) {

            }
        })
    }

    fun  getItemDisplayFragment(position : Int) : ItemImageDisplayFragment =
            ((product_image_view_pager.adapter as ItemImagesPagerAdapter).getItem(position) as ItemImageDisplayFragment)
}