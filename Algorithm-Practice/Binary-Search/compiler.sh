#!/bin/bash -ex

SRC=src
BIN=bin
JAVA=java
JAVAC='javac -d bin'
CP='-cp bin'
rm -rf bin
mkdir bin
javac -cp bin -d bin src/BinarySearch.java
java -cp bin BinarySearch
