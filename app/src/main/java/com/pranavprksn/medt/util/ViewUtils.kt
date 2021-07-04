package com.pranavprksn.medt.util

import android.content.Context
import android.widget.Toast

fun Context.toastMessage(message : String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}