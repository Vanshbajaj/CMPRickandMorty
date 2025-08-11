# 🛸 RickAndMockety – Kotlin Multiplatform App

A fully **Kotlin Multiplatform** project targeting **Android**, **iOS**, **Desktop**, and **Web**. Built using **Jetpack Compose Multiplatform**, **Clean Architecture**, **Koin for DI**, and modern Kotlin libraries.

Fetches data from the [Rick and Morty API](https://rickandmortyapi.com/) and displays characters, locations, and episodes in a shared Compose UI across all platforms.

---

## 📱 Supported Platforms

| Platform | Status |
|----------|--------|
| Android  | ✅     |
| iOS      | ✅     |
| Desktop  | ✅     |
| Web      | ✅     |

---

## 🌟 Features

- ✅ Shared UI in Jetpack Compose (Multiplatform)
- ✅ Koin for dependency injection across platforms
- ✅ MVVM + Clean Architecture
- ✅ Kotlinx Coroutines & Flow for async/reactive streams
- ✅ Ktor Client for network requests
- ✅ Character list & detail views (Rick and Morty API)
- ✅ Modular, testable codebase
- ✅ Compose previews & screenshot testing (Android/Desktop)

---

## 📂 Project Structure

```bash
rickandmockety/
├── build.gradle.kts
├── settings.gradle.kts
├── shared/                      # Shared KMP code (UI, domain, data)
│   ├── src/commonMain/kotlin/
│   │   ├── di/                  # Koin modules
│   │   ├── ui/                 # Compose UI shared across platforms
│   │   ├── data/               # Ktor API, DTOs, repository impls
│   │   └── domain/             # Entities, use cases, interfaces
│   └── build.gradle.kts
├── androidApp/                 # Android app module
│   ├── src/main/kotlin/
│   └── build.gradle.kts
├── iosApp/                     # iOS app via Kotlin CocoaPods
├── desktopApp/                 # JVM Desktop app
│   └── build.gradle.kts
├── webApp/                     # Compose for Web app
│   └── build.gradle.kts
```

## 🔧 Tech Stack
### 🎨 UI
- Jetpack Compose Multiplatform
- Material 3 Design
- Responsive layout (Desktop, Web, Mobile)

### 🌍 Networking
- Ktor Client for HTTP requests
- Kotlinx Serialization for JSON parsing

### 💉 Dependency Injection
- Koin – Multiplatform DI

### ⚙️ Architecture
#### Clean Architecture
- data/ - API + repository implementations
- domain/ - Use cases + interfaces
- ui/ - ViewModels + screens

#### MVVM
Repository Pattern

### 🖼️ Image Loading
Compose-compatible image loaders (Skiko, Coil)

### 🧪 Testing
Unit testing in commonTest
Screenshot testing (Android/Desktop)

### Compose Preview support

## 🚀 How to Run
### ▶️ Android
```bash
./gradlew :androidApp:installDebug
Open in Android Studio and run on emulator or device.
```

### 🍏 iOS
Setup CocoaPods via shared/build.gradle.kts
Open iosApp.xcworkspace in Xcode
Build and run on a simulator or device

### 🖥️ Desktop
```bash
./gradlew :desktopApp:run
```
Runs a native Compose desktop application.

### 🌍 Web
```bash
./gradlew :webApp:jsBrowserRun
```
Open http://localhost:8080 to see it in the browser.

### 🧪 Testing
```bash
./gradlew :shared:allTests – Runs all shared tests
./gradlew lint – Run Android lint checks
```
Snapshot/screenshot testing available for Android/Desktop via Compose Testing



### 🛠 Future Improvements
 - Offline caching with SQLDelight / Room
 - Compose UI tests on iOS/Web
 - Improved API error handling
 - Dark Mode support
 - Localization & accessibility

### 📜 License
MIT License © 2025 Vansh Bajaj

### 🤝 Contributing
Contributions are welcome! If you want to help add new features, improve performance, or make this a better multiplatform sample — open a PR or issue.

