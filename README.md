# libJDubX-android
Quickstart

## How to:
- In the console:
  ```
  git clone --recursive {this repo url} {new project name}
  cd {project name}/libJDubX/
  git checkout master
  cd ..
  git remote rename origin quickstart
  git remote set-url --push quickstart DISABLED
  ```
  - If you want to use a new repo, do:
    ```
    git remote add origin {new repo url}
    git pull origin master --allow-unrelated-histories
    git push -u origin master
    ```
- Move the files in gdx-game/src/example and gdx-game-android/src/example to your own package
- In each of those files, change the example packages and names accordingly
- In the androidmanifest, change the package, version, and/or orientations
- Take over Example.java
