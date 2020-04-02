# BiometricPromt Authenticaton
This is an Android application that uses BiometricPromt Authentication before accessing the application. The authentication works with your phone's prefered biometric settings. If you have the preference set to 'Face Recognition' then the application will authenticate using face recognition. If your phone settings has set 'Fingerprint' as preferred authenticator, then the application will use your fingerprints to authenticate.

# Add the following dependency in your gradle.build (app) file
implementation 'androidx.biometric:biometric:1.0.0'
