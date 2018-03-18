package com.whitecloak.drapp.utils

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
import android.support.v4.app.FragmentActivity
import android.widget.Toast

/**
 * This file illustrates Kotlin's Extension Functions by extending FragmentActivity.
 */

/**
 * Shows a [Toast] on the UI thread.
 *
 * @param text The message to show
 */
fun FragmentActivity.showToast(text: String) {
    runOnUiThread { Toast.makeText(this, text, Toast.LENGTH_SHORT).show() }
}
