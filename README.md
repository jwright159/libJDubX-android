# libJDubX-android
Quickstart

## How to:
- In the console:
```
cd {wherever}
git clone {this thing}
git submodule init
git submodule update --remote
cd libJDubX
git checkout master
```
- Move the files in gdx-game/src/example and gdx-game-android/src/example to your own package
- In each of those files, change the package accordingly
- In the androidmanifest, change the package, version, and/or orientations
- Finally, in your gdx-game package, make a new class that extends WScreen and replace the erroneous reference tonit in MyGdxGame.java
