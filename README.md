This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

# Rick and Morty Kotlin App 🧪🚀

A sample Android project built in Kotlin using **Clean Architecture**, **MVVM**, and modern Android development practices. It fetches data from the [Rick and Morty API](https://rickandmortyapi.com/) and displays characters, locations, and episodes.

---

## 🌐 Features

- Fetch characters, locations, and episodes from the Rick and Morty API
- View detailed information with responsive UI
- Paginated list of characters
- Clean Architecture separation of concerns
- Offline caching support (optional, see future improvements)

---

## 📱 Screenshots

<img width="370" height="817" alt="image" src="https://github.com/user-attachments/assets/41d8035e-c5ee-4f98-b68e-36241256f539" />



---

## 🧱 Tech Stack

### Architecture
- Clean Architecture (Data → Domain → Presentation)
- MVVM (Model-View-ViewModel)
- Repository Pattern
- Dependency Injection with **Hilt**

### Networking
- **Ktor Client** – For making HTTP requests
- **Kotlinx Serialization** – For parsing JSON responses

### Image Loading
- **Coil** – Image loading and caching

### Async & Reactive
- **Coroutines** – For asynchronous programming
- **Flow** – For reactive data streams

### UI & Design
- Jetpack **Compose** (or traditional XML if not Compose-based)
- Material Design components

🧪 Testing
Unit testing for Use Cases and ViewModels

Mocked repositories for clean testing of domain logic

🚧 Future Improvements
Add offline caching using Room

UI testing with Jetpack Compose Testing / Espresso

Improved error handling and retry mechanism

Dark mode support



---

## 📂 Project Structure

```bash
rick-and-morty/
├── data/           # Remote & local data sources, DTOs, repositories
├── domain/         # Entities and use cases
├── presentation/   # UI components, ViewModels, Mappers
├── di/             # Hilt modules for dependency injection
└── utils/          # Common utilities and extensions


