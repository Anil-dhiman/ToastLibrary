package com.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {

    companion object {
        public fun showMessage(context:Context,message : String){
            Toast.makeText(context,"$message",Toast.LENGTH_SHORT).show()
        }
    }

}