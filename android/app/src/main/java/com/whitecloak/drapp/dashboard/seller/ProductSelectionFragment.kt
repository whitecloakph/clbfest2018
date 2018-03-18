package com.whitecloak.drapp.dashboard.seller

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.whitecloak.drapp.R
import com.whitecloak.drapp.camera.PRODUCT_IMAGE_PATH_KEY
import com.whitecloak.drapp.models.Product
import com.whitecloak.drapp.utils.notNull
import kotlinx.android.synthetic.main.product_selection_display_layout.view.*

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
const val PRODUCT_NAME = "PRODUCT_NAME"
const val PRODUCT_DESCRIPTION = "PRODUCT_DESCRIPTION"
const val PRODUCT_PRICE = "PRODUCT_PRICE"

class ProductSelectionFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.product_selection_display_layout, container, false)
        arguments.notNull {
            view.product_name.text = it.getString(PRODUCT_NAME)
            view.product_description.text = it.getString(PRODUCT_DESCRIPTION)
            view.product_price.text = it.getString(PRODUCT_PRICE)
            Picasso.get().load(it.getString(PRODUCT_IMAGE_PATH_KEY)).into(view.product_image)
        }
        return view
    }

    companion object {

        fun newInstance(product: Product) : ProductSelectionFragment {
            val args = Bundle()
            val asset_base_url = "file:///android_asset/"
            args.putString(PRODUCT_IMAGE_PATH_KEY, asset_base_url + product.imagePath)
            args.putString(PRODUCT_NAME, product.name)
            args.putString(PRODUCT_DESCRIPTION, product.description)
            args.putString(PRODUCT_PRICE, product.price)

            val fragment = ProductSelectionFragment()
            fragment.arguments = args
            return fragment
        }
    }
}