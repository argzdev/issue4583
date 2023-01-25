package com.argz.issue4583

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.installations.FirebaseInstallations

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseInstallations.getInstance().delete().addOnCompleteListener { task ->
            if (task.isComplete) {
                Log.d("Installations", "Installation deleted")
            }  else {
                Log.e("Installations", "Unable to delete Installation")
            }
        }
    }
}