package com.example.fingerprintdemo

import androidx.biometric.BiometricPrompt
import androidx.fragment.app.FragmentActivity
import java.util.concurrent.Executor

class FingerPrintManagementUtil (activity: FragmentActivity, executor: Executor, callBack:BiometricPrompt.AuthenticationCallback) {
    private var biometricPrompt = BiometricPrompt(activity, executor, callBack)

    fun showBiometricPromt() {
        val prompt = BiometricPrompt.PromptInfo.Builder()
            .setTitle("Authenticate")
            .setSubtitle("Use Biometric Authentication")
            .setDescription("Use Biometric to Continue (Can use both face and fingerprint")
            .setNegativeButtonText("Cancel")
            .build()

        biometricPrompt.authenticate(prompt)
    }
}