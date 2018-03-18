package com.whitecloak.drapp.camera

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.whitecloak.drapp.R
import com.whitecloak.drapp.utils.notNull
import kotlinx.android.synthetic.main.product_image_layout.view.*

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
const val PRODUCT_IMAGE_PATH_KEY = "PRODUCT_IMAGE_PATH"

class ProductImageOverlayFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.product_image_layout, container, false)
        arguments.notNull {
            Picasso.get().load(it.getString(PRODUCT_IMAGE_PATH_KEY)).into(view.product_image)
        }
        return view
    }

    companion object {

        fun newInstance(productImagePath: String): ProductImageOverlayFragment {

            val args = Bundle()
            val asset_base_url = "file:///android_asset/"
            args.putString(PRODUCT_IMAGE_PATH_KEY, asset_base_url + productImagePath)

            val fragment = ProductImageOverlayFragment()
            fragment.arguments = args
            return fragment
        }
    }
}