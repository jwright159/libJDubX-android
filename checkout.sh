#!/bin/sh
cd libJDubX
git checkout master
cd ..
git remote rename origin quickstart
git remote set-url --push quickstart DISABLED
