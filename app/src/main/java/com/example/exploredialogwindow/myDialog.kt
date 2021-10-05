package com.example.exploredialogwindow

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class myDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // using builder, since this dialog has a simple UI
        val builder = AlertDialog.Builder(this.requireActivity())

        builder.setMessage("This is an alert box").setPositiveButton("OK", { dialog, id ->
            // TODO: FOR LATER
        }
        ).setNegativeButton("CANCLE", {dialog, id ->
            // TODO: FOR LATER
        })

        return builder.create()
    }
}