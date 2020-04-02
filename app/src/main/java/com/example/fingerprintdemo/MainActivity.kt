package com.example.fingerprintdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.biometric.BiometricPrompt
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FingerPrintManagementUtil(this, Executors.newSingleThreadExecutor(), callBack).showBiometricPromt()
    }

    private val callBack = object : BiometricPrompt.AuthenticationCallback(){
        override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
            super.onAuthenticationError(errorCode, errString)
            Log.e("MainActivity", errString.toString())
        }

        override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
            super.onAuthenticationSucceeded(result)
            runOnUiThread{
                Toast.makeText(this@MainActivity, "Authentication Success", Toast.LENGTH_LONG).show()
            }
        }

        override fun onAuthenticationFailed() {
            super.onAuthenticationFailed()
            Log.e("MainActivity", "Authentication Failed")
        }
    }
}
