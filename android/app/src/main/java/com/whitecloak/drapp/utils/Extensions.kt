package com.whitecloak.drapp.utils

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
fun <T : Any> T?.notNull(blockToBeExecuted: (it: T) -> Unit) {
    if (this != null) blockToBeExecuted(this)
}