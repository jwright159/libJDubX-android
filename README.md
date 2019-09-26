# libJDubX-android
Quickstart

## How to:
- Clone the git project using the `--recursive` option
- `cd` into the project folder and run `checkout.sh`
  - If you want to use a new repo, do:
    ```
    git remote add origin {new repo url}
    git pull origin master --allow-unrelated-histories
    git push -u origin master
    ```
- Move the files in `gdx-game/src/com/example` and `gdx-game-android/src/com/example` to your own package
- In each of those files, change the example packages and names accordingly
- In `gdx-game-android/AndroidManifest.xml`, change the package, version, and/or orientations
- Take over `gdx-game/src/{package}/ExampleScreen.java`
