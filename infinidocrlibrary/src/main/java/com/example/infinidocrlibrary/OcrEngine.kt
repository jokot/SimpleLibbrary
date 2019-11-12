package com.example.infinidocrlibrary

import android.content.Context
import android.widget.Toast

class OcrEngine {
    fun createToast(context: Context, message:String){
        Toast.makeText(context,message, Toast.LENGTH_LONG).show()
    }
}