# Khoj Android App

A premium, fully functional Android WebView application for **Khoj-BD** (https://www.khoj-bd.com/), built with Java and modern Android development practices.

## 🚀 Features

- **Premium Animated Splash Screen**: Features a smooth fade-in and scale-up animation with Bengali typography ("খোঁজ") and a blur-to-clear tagline animation ("সত্যের সন্ধান, তথ্যের শুদ্ধি").
- **Custom Typography**: Integrated **Tiro Bangla** font for a professional native Bengali experience.
- **Modern WebView Implementation**:
    - Swipe-to-refresh for easy page reloading.
    - Native horizontal progress bar.
    - Optimized safe-area handling (Status bar doesn't overlap content).
    - Hidden scrollbars for a clean, app-like feel.
- **Native Error Handling**: Custom Bengali error screen with a retry option for connection failures.
- **Download Support**: Integrated with Android's `DownloadManager` for handling file downloads.
- **Safe Browsing & Security**: Configured with modern security best practices for WebView.

---

## 🛠 Project Configuration

- **Minimum SDK**: 26 (Android 8.0)
- **Target/Compile SDK**: 36
- **Language**: Java
- **UI**: XML Layouts (No Compose)

---

## 📦 Publishing Directions (Read Before Production)

Follow these steps to prepare the app for the Google Play Store or distribution:

### 1. Generate a Signed APK/Bundle
The current build is a **Debug** version. To publish, you must generate a signed version:
- Go to **Build > Generate Signed Bundle / APK**.
- Select **Android App Bundle** (preferred for Play Store).
- **Create a KeyStore**: This is your digital signature. 
    - **⚠️ IMPORTANT**: Keep this file and your passwords extremely safe. If you lose them, you will never be able to update your app on the Play Store.

### 2. Check App Name & Package ID
- **App Name**: Currently set to `Khoj` in `app/src/main/res/values/strings.xml`.
- **Package ID**: Currently `com.tusher.khoj`. 
    - Verify this is correct before publishing, as it serves as the unique identity of your app and **cannot be changed** once the app is live.

### 3. Enable ProGuard / R8 (Recommended)
To shrink the app size and protect your source code (obfuscation):
- Open `app/build.gradle`.
- In the `buildTypes { release { ... } }` block, set `minifyEnabled true`.
- Ensure your ProGuard rules are configured if you add third-party libraries later.

### 4. Final Launch Icons
Ensure the launcher icons are correctly generated to look professional on all devices:
- Right-click the `res` folder in Android Studio.
- Select **New > Image Asset**.
- Browse to `app/src/assets/app_icon.png`.
- Use the **Image Asset Studio** to adjust scaling and generate all density versions (hdpi, xhdpi, etc.).

### 5. Test on Physical Devices
Before public release, test the **Release APK/Bundle** on at least one physical device:
- Verify that the splash screen timing (3.5s) feels natural.
- Ensure the WebView correctly handles internal redirects and downloads on real hardware.
- Confirm the status bar color (`#D1E9FF`) looks good on different screen types.

---

## ✒️ Developer Credit
**Built by Mahatir Ahmed Tusher**  
Website: [https://www.khoj-bd.com/](https://www.khoj-bd.com/)

---
*Generated for the Khoj-App Project - 2026*