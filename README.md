# Vrid Assignment App

Android application that serves as a blog reading app.
The app retrieves blog data from the below given API, display it in an organized
manner, and allow users to read individual blog posts. 
WebView is used to display content of each individual blog.

The basic app will have two screens -
1. List of blogs
2. Individual blog content (using WebView)

Api : https://blog.vrid.in/wp-json/wp/v2/posts?per_page=10&page=1

## Tech Stack
- Kotlin
* Jetpack Compose
* Coroutines
+ Retrofit
* Hilt, Dagger
+ Navigation Compose
- Clean Architecture
- Coil library

![Clean Architecture Screenshot](https://drive.google.com/file/d/1knVNb9Kn4AtqR9bULrGeuan09S1DJhWd/view?usp=sharing)

## Demo
![Demo](https://drive.google.com/file/d/1A6b-NfLLofVAfQWa6lm86sRHheZiqOSo/view?usp=sharing)

