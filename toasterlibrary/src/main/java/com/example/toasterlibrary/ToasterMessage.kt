package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun createToast(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}