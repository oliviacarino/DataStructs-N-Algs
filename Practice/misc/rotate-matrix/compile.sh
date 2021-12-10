#!/bin/bash -ex

SRC=src
BIN=bin
rm -rf bin
mkdir bin
javac -cp bin -d bin src/RotateMatrix.java
java -cp bin RotateMatrix