package com.whitecloak.drapp.dashboard.buyer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.whitecloak.drapp.R
import com.whitecloak.drapp.camera.PRODUCT_IMAGE_PATH_KEY
import com.whitecloak.drapp.utils.notNull
import kotlinx.android.synthetic.main.product_image_layout.view.*

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class ItemImageDisplayFragment : Fragment(){

    public fun scaleImage(scale : Float){
        view.notNull {
            it.scaleY = scale
            it.invalidate()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.item_image_layout, container, false)
        arguments.notNull {
            Picasso.get().load(it.getString(PRODUCT_IMAGE_PATH_KEY)).into(view.product_image)
        }
        return view
    }
    companion object {
        fun newInstance(imagePath: String) : ItemImageDisplayFragment{
            val args = Bundle()
            val asset_base_url = "file:///android_asset/"
            args.putString(PRODUCT_IMAGE_PATH_KEY, asset_base_url + imagePath)
            val fragment = ItemImageDisplayFragment()
            fragment.arguments = args
            return fragment
        }
    }
}