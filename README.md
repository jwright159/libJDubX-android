# libJDubX-android
Quickstart

## How to:
- In the console:
```
cd {wherever}
git clone {this thing}
git branch -u origin/master
git submodule init
git submodule update --remote
cd libJDubX
git checkout master
```
- Move the files in gdx-game/src/example and gdx-game-android/src/example to your own package
- In each of those files, change the example packages and names accordingly
- In the androidmanifest, change the package, version, and/or orientations
- Take over Example.java
