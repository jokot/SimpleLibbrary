package com.example.simplelibrary

import android.content.Context
import android.widget.Toast

class LivenessEngine {
    fun createToast(context: Context, message:String){
        Toast.makeText(context,message, Toast.LENGTH_LONG).show()
    }
}