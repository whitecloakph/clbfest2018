package com.whitecloak.drapp.customview

import android.Manifest
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import com.whitecloak.drapp.R
import com.whitecloak.drapp.utils.REQUEST_CAMERA_PERMISSION
import com.whitecloak.drapp.utils.notNull

/**
 * Created by kimnicolemontano on 2018/03/17.
 */
class ConfirmationDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(activity)
                    .setMessage(R.string.request_permission)
                    .setPositiveButton(android.R.string.ok) { _, _ ->
                        parentFragment.notNull { requestPermissions(arrayOf(Manifest.permission.CAMERA),
                                REQUEST_CAMERA_PERMISSION) }
                    }
                    .setNegativeButton(android.R.string.cancel) { _, _ ->
                        parentFragment.notNull { it.activity.notNull { it.finish() } }
                    }
                    .create()
}