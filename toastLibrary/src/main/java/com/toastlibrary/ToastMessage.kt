package com.toastlibrary

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService


class ToastMessage {

    companion object {
        public fun showMessage(context:Context,message : String){
            Toast.makeText(context,"$message",Toast.LENGTH_SHORT).show()
            val v = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                v?.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                v?.vibrate(500)
            }
        }
    }

}