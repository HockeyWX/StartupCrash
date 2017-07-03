# StartupCrash-Android

The steps are:

Subclass android.app.Application and add CrashManager.initialize in its onCreate, ideally as the second line after the call to super.

Set the new subclass in your AndroidManifest.xml.

Call CrashManager.execute in onResume of your main activity or in onCreate if you have auto-send enabled.

If you have an implementation on CrashManagerListener, make this a singleton and use it for both initialize and register.
