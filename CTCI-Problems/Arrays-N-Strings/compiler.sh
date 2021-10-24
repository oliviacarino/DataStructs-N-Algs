#!/bin/bash -ex

rm -rf bin
mkdir bin
javac -d bin  src/ArraysStrings.java
java -cp bin ArraysStrings
