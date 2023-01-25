# issue 4583
### GitHub link
- https://github.com/firebase/firebase-android-sdk/issues/4583
### What product is affected?
- Firebase Installations
### Description
- Calling `FirebaseInstallations.delete` on Android 13 devices will trigger `android.os.strictmode.LeakedClosableViolation` from Strict Mode.
### Steps to reproduce issue
- Run project
- App will crash right after running since `FirebaseInstallations.delete` is called at `onCreate`
